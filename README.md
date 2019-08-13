### 父工程
####1.各包之间的引用关系

 `zfx-ssm-web`<br>
 > zfx-ssm-common<br>
 > zfx-ssm-service
  ***
 `zfx-ssm-mapper`<br>
 > zfx-ssm-pojo

 ***
 `zfx-ssm-service`
 > zfx-ssm-pojo<br>
 > zfx-ssm-mapper
 ***
 `zfx-ssm-pojo`
 > 这是一个实体类，不需要引用其他模块
 
####2 注意事项：
父工程只保留`.pom`,`.iml`,`.idea`
####3 遇到的问题：
mapper.xml的映射配置：`mybatis.mapperLocations=classpath*:mapper/*.xml`
 