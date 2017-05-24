package com.chariot.shadow.news;

import java.sql.Timestamp;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.4.v20160829-rNA", date="2017-05-24T19:16:01")
@StaticMetamodel(News.class)
public class News_ { 

    public static volatile SingularAttribute<News, String> newsId;
    public static volatile SingularAttribute<News, Timestamp> registrationTimestamp;
    public static volatile SingularAttribute<News, String> supplierId;
    public static volatile SingularAttribute<News, Date> publishDate;
    public static volatile SingularAttribute<News, String> link;
    public static volatile SingularAttribute<News, Integer> id;
    public static volatile SingularAttribute<News, String> title;
    public static volatile SingularAttribute<News, String> content;

}