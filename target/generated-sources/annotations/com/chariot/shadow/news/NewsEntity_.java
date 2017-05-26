package com.chariot.shadow.news;

import java.sql.Timestamp;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.4.v20160829-rNA", date="2017-05-26T20:03:05")
@StaticMetamodel(NewsEntity.class)
public class NewsEntity_ { 

    public static volatile SingularAttribute<NewsEntity, String> newsId;
    public static volatile SingularAttribute<NewsEntity, Timestamp> registrationTimestamp;
    public static volatile SingularAttribute<NewsEntity, String> supplierId;
    public static volatile SingularAttribute<NewsEntity, Date> publishDate;
    public static volatile SingularAttribute<NewsEntity, String> link;
    public static volatile SingularAttribute<NewsEntity, Integer> id;
    public static volatile SingularAttribute<NewsEntity, String> title;
    public static volatile SingularAttribute<NewsEntity, String> content;

}