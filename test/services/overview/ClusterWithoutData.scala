package services.overview

import play.api.libs.json.Json

object ClusterWithoutData {

  def apply() = ClusterOverview(settings, health, nodes, indices, shards, aliases)

  val settings = Json.parse(
    """
      |{
      |  "persistent" : { },
      |  "transient" : { }
      |}
    """.stripMargin
  )

  val health = Json.parse(
    """
      |{
      |  "cluster_name" : "elasticsearch",
      |  "status" : "green",
      |  "timed_out" : false,
      |  "number_of_nodes" : 1,
      |  "number_of_data_nodes" : 1,
      |  "active_primary_shards" : 0,
      |  "active_shards" : 0,
      |  "relocating_shards" : 0,
      |  "initializing_shards" : 0,
      |  "unassigned_shards" : 0,
      |  "delayed_unassigned_shards" : 0,
      |  "number_of_pending_tasks" : 0,
      |  "number_of_in_flight_fetch" : 0,
      |  "task_max_waiting_in_queue_millis" : 0,
      |  "active_shards_percent_as_number" : 50
      |}
    """.stripMargin
  )

  val nodes = Json.parse(
    """
      |[
      |  {
      |    "id": "rtOe",
      |    "ip": "127.0.0.1",
      |    "version": "5.3.0",
      |    "jdk": "1.8.0_92",
      |    "disk.avail": "114.5gb",
      |    "heap.current": "403.7mb",
      |    "heap.percent": "20",
      |    "heap.max": "1.9gb",
      |    "cpu": "23",
      |    "load_1m": "3.45",
      |    "node.role": "mdi",
      |    "master": "*",
      |    "name": "rtOejLm"
      |  }
      |]
    """.stripMargin)

  val indices = Json.parse(
    """
      |[
      |]
    """.stripMargin)


  val shards = Json.parse(
    """
      |[
      |]
    """.stripMargin)

  val aliases = Json.parse(
    """
      |[
      |]
    """.stripMargin)


}
