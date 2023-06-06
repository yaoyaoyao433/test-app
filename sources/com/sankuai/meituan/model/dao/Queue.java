package com.sankuai.meituan.model.dao;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class Queue {
    public static ChangeQuickRedirect changeQuickRedirect;
    private PoiInfo PoiInfo;
    private QueueInfo QueueInfo;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class PoiInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        private String brandName;
        private boolean isConnected;
        private String operate;
        private long poiId;
        private String pointName;
        private double pricePerson;
        private String shortOperate;
        private String shortStateText;
        private int state;
        private String stateText;
        private int totalQueueLength;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class QueueInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        private int front;
        private String name;
        private String queueId;
        private String table;
    }
}
