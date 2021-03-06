package plantae.citrus.mqtt.actors

import akka.actor._
import com.typesafe.config.ConfigFactory
import plantae.citrus.mqtt.actors.directory._
import plantae.citrus.mqtt.actors.session.SessionRoot
import plantae.citrus.mqtt.actors.topic.TopicRoot

/**
 * Created by yinjae on 15. 4. 21..
 */
object ActorContainer {
  val system = ActorSystem("mqtt", ConfigFactory.load.getConfig("mqtt"))
  val sessionRoot = system.actorOf(Props[SessionRoot], "session")
  val topicRoot = system.actorOf(Props[TopicRoot], "topic")
  val directoryProxy = system.actorOf(Props[DirectoryProxy], "directory")

  def directoryOperation(x: DirectoryOperation, senderContext: ActorContext, originalSender: ActorRef) = {
    implicit val context: ActorContext = senderContext
    directoryProxy.forward(x)
  }


  def invokeCallback(directoryReq: DirectoryReq, senderContext: ActorContext, props: Props) = {
    directoryProxy.tell(directoryReq, senderContext.actorOf(props))
  }
}

