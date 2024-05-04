package com.springmongodb.MongoDB_Connection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongoDbConnectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoDbConnectionApplication.class, args);
	}

}


/*

CLUSTER_URI: "mongodb+srv://aalinemarsh1610:KhNVdql0ctld14pv@cluster0.eomdelf.mongodb.net/EmployeeData"



SPRING_LOG_ATLAS_CLUSTER_SERVER
2024-05-04T07:13:27.197+05:30  INFO 6504 --- [MongoDB_Connection] [           main] org.mongodb.driver.client                : MongoClient with metadata {"driver": {"name": "mongo-java-driver|sync|spring-boot", "version": "4.11.2"}, "os": {"type": "Windows", "name": "Windows 11", "architecture": "amd64", "version": "10.0"}, "platform": "Java/Oracle Corporation/17.0.10+11-LTS-240"} created with settings MongoClientSettings{readPreference=primary, writeConcern=WriteConcern{w=null, wTimeout=null ms, journal=null}, retryWrites=true, retryReads=true, readConcern=ReadConcern{level=null}, credential=MongoCredential{mechanism=null, userName='aalinemarsh1610', source='admin', password=<hidden>, mechanismProperties=<hidden>}, transportSettings=null, streamFactoryFactory=null, commandListeners=[], codecRegistry=ProvidersCodecRegistry{codecProviders=[ValueCodecProvider{}, BsonValueCodecProvider{}, DBRefCodecProvider{}, DBObjectCodecProvider{}, DocumentCodecProvider{}, CollectionCodecProvider{}, IterableCodecProvider{}, MapCodecProvider{}, GeoJsonCodecProvider{}, GridFSFileCodecProvider{}, Jsr310CodecProvider{}, JsonObjectCodecProvider{}, BsonCodecProvider{}, EnumCodecProvider{}, com.mongodb.client.model.mql.ExpressionCodecProvider@4ecd00b5, com.mongodb.Jep395RecordCodecProvider@10947c4e, com.mongodb.KotlinCodecProvider@3667faa8]}, loggerSettings=LoggerSettings{maxDocumentLength=1000}, clusterSettings={hosts=[127.0.0.1:27017], srvHost=cluster0.eomdelf.mongodb.net, srvServiceName=mongodb, mode=MULTIPLE, requiredClusterType=REPLICA_SET, requiredReplicaSetName='atlas-bn28sa-shard-0', serverSelector='null', clusterListeners='[]', serverSelectionTimeout='30000 ms', localThreshold='15 ms'}, socketSettings=SocketSettings{connectTimeoutMS=10000, readTimeoutMS=0, receiveBufferSize=0, proxySettings=ProxySettings{host=null, port=null, username=null, password=null}}, heartbeatSocketSettings=SocketSettings{connectTimeoutMS=10000, readTimeoutMS=10000, receiveBufferSize=0, proxySettings=ProxySettings{host=null, port=null, username=null, password=null}}, connectionPoolSettings=ConnectionPoolSettings{maxSize=100, minSize=0, maxWaitTimeMS=120000, maxConnectionLifeTimeMS=0, maxConnectionIdleTimeMS=0, maintenanceInitialDelayMS=0, maintenanceFrequencyMS=60000, connectionPoolListeners=[], maxConnecting=2}, serverSettings=ServerSettings{heartbeatFrequencyMS=10000, minHeartbeatFrequencyMS=500, serverListeners='[]', serverMonitorListeners='[]'}, sslSettings=SslSettings{enabled=true, invalidHostNameAllowed=false, context=null}, applicationName='null', compressorList=[], uuidRepresentation=JAVA_LEGACY, serverApi=null, autoEncryptionSettings=null, dnsClient=null, inetAddressResolver=null, contextProvider=null}
2024-05-04T07:13:27.221+05:30  INFO 6504 --- [MongoDB_Connection] [elf.mongodb.net] org.mongodb.driver.cluster               : Adding discovered server ac-fcte8ul-shard-00-00.eomdelf.mongodb.net:27017 to client view of cluster
2024-05-04T07:13:27.276+05:30  INFO 6504 --- [MongoDB_Connection] [elf.mongodb.net] org.mongodb.driver.cluster               : Adding discovered server ac-fcte8ul-shard-00-01.eomdelf.mongodb.net:27017 to client view of cluster
2024-05-04T07:13:27.282+05:30  INFO 6504 --- [MongoDB_Connection] [elf.mongodb.net] org.mongodb.driver.cluster               : Adding discovered server ac-fcte8ul-shard-00-02.eomdelf.mongodb.net:27017 to client view of cluster
2024-05-04T07:13:28.896+05:30  INFO 6504 --- [MongoDB_Connection] [ngodb.net:27017] org.mongodb.driver.cluster               : Monitor thread successfully connected to server with description ServerDescription{address=ac-fcte8ul-shard-00-01.eomdelf.mongodb.net:27017, type=REPLICA_SET_PRIMARY, state=CONNECTED, ok=true, minWireVersion=0, maxWireVersion=21, maxDocumentSize=16777216, logicalSessionTimeoutMinutes=30, roundTripTimeNanos=1165202600, setName='atlas-bn28sa-shard-0', canonicalAddress=ac-fcte8ul-shard-00-01.eomdelf.mongodb.net:27017, hosts=[ac-fcte8ul-shard-00-01.eomdelf.mongodb.net:27017, ac-fcte8ul-shard-00-00.eomdelf.mongodb.net:27017, ac-fcte8ul-shard-00-02.eomdelf.mongodb.net:27017], passives=[], arbiters=[], primary='ac-fcte8ul-shard-00-01.eomdelf.mongodb.net:27017', tagSet=TagSet{[Tag{name='availabilityZone', value='aps1-az3'}, Tag{name='diskState', value='READY'}, Tag{name='nodeType', value='ELECTABLE'}, Tag{name='provider', value='AWS'}, Tag{name='region', value='AP_SOUTH_1'}, Tag{name='workloadType', value='OPERATIONAL'}]}, electionId=7fffffff0000000000000038, setVersion=38, topologyVersion=TopologyVersion{processId=66334b6c6388e9f32a06ea49, counter=6}, lastWriteDate=Sat May 04 07:13:29 IST 2024, lastUpdateTimeNanos=559063953821799}
2024-05-04T07:13:28.896+05:30  INFO 6504 --- [MongoDB_Connection] [ngodb.net:27017] org.mongodb.driver.cluster               : Monitor thread successfully connected to server with description ServerDescription{address=ac-fcte8ul-shard-00-00.eomdelf.mongodb.net:27017, type=REPLICA_SET_SECONDARY, state=CONNECTED, ok=true, minWireVersion=0, maxWireVersion=21, maxDocumentSize=16777216, logicalSessionTimeoutMinutes=30, roundTripTimeNanos=1165243200, setName='atlas-bn28sa-shard-0', canonicalAddress=ac-fcte8ul-shard-00-00.eomdelf.mongodb.net:27017, hosts=[ac-fcte8ul-shard-00-01.eomdelf.mongodb.net:27017, ac-fcte8ul-shard-00-00.eomdelf.mongodb.net:27017, ac-fcte8ul-shard-00-02.eomdelf.mongodb.net:27017], passives=[], arbiters=[], primary='ac-fcte8ul-shard-00-01.eomdelf.mongodb.net:27017', tagSet=TagSet{[Tag{name='availabilityZone', value='aps1-az1'}, Tag{name='diskState', value='READY'}, Tag{name='nodeType', value='ELECTABLE'}, Tag{name='provider', value='AWS'}, Tag{name='region', value='AP_SOUTH_1'}, Tag{name='workloadType', value='OPERATIONAL'}]}, electionId=null, setVersion=38, topologyVersion=TopologyVersion{processId=66334c9df1628e0c5ee8e5c5, counter=4}, lastWriteDate=Sat May 04 07:13:29 IST 2024, lastUpdateTimeNanos=559063953911600}
2024-05-04T07:13:28.896+05:30  INFO 6504 --- [MongoDB_Connection] [ngodb.net:27017] org.mongodb.driver.cluster               : Monitor thread successfully connected to server with description ServerDescription{address=ac-fcte8ul-shard-00-02.eomdelf.mongodb.net:27017, type=REPLICA_SET_SECONDARY, state=CONNECTED, ok=true, minWireVersion=0, maxWireVersion=21, maxDocumentSize=16777216, logicalSessionTimeoutMinutes=30, roundTripTimeNanos=1165137299, setName='atlas-bn28sa-shard-0', canonicalAddress=ac-fcte8ul-shard-00-02.eomdelf.mongodb.net:27017, hosts=[ac-fcte8ul-shard-00-01.eomdelf.mongodb.net:27017, ac-fcte8ul-shard-00-00.eomdelf.mongodb.net:27017, ac-fcte8ul-shard-00-02.eomdelf.mongodb.net:27017], passives=[], arbiters=[], primary='ac-fcte8ul-shard-00-01.eomdelf.mongodb.net:27017', tagSet=TagSet{[Tag{name='availabilityZone', value='aps1-az2'}, Tag{name='diskState', value='READY'}, Tag{name='nodeType', value='ELECTABLE'}, Tag{name='provider', value='AWS'}, Tag{name='region', value='AP_SOUTH_1'}, Tag{name='workloadType', value='OPERATIONAL'}]}, electionId=null, setVersion=38, topologyVersion=TopologyVersion{processId=66334e667d7359ae44624487, counter=3}, lastWriteDate=Sat May 04 07:13:29 IST 2024, lastUpdateTimeNanos=559063953704200}
2024-05-04T07:13:28.912+05:30  INFO 6504 --- [MongoDB_Connection] [ngodb.net:27017] org.mongodb.driver.cluster               : Discovered replica set primary ac-fcte8ul-shard-00-01.eomdelf.mongodb.net:27017 with max election id 7fffffff0000000000000038 and max set version 38
2024-05-04T07:13:29.386+05:30  INFO 6504 --- [MongoDB_Connection] [           main] o.s.b.a.w.s.WelcomePageHandlerMapping    : Adding welcome page template: index
2024-05-04T07:13:30.917+05:30  INFO 6504 --- [MongoDB_Connection] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path ''
2024-05-04T07:13:30.957+05:30  INFO 6504 --- [MongoDB_Connection] [           main] c.s.M.MongoDbConnectionApplication       : Started MongoDbConnectionApplication in 11.174 seconds (process running for 11.876)
2024-05-04T07:13:42.858+05:30  INFO 6504 --- [MongoDB_Connection] [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2024-05-04T07:13:42.858+05:30  INFO 6504 --- [MongoDB_Connection] [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2024-05-04T07:13:42.858+05:30  INFO 6504 --- [MongoDB_Connection] [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 0 ms

 */
