package com.meituan.android.common.statistics.ipc;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RequestIDMap {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class OP_TYPE_CHANNEL {
        public static final int OP_TYPE_EVENT = 10008;
        public static final int OP_TYPE_GET_ALL_ENV = 10006;
        public static final int OP_TYPE_GET_ENV = 10005;
        public static final int OP_TYPE_GET_SEQ = 10007;
        public static final int OP_TYPE_GET_TAG = 10002;
        public static final int OP_TYPE_REGISTER_TAG = 10001;
        public static final int OP_TYPE_REMOVE_TAG = 10003;
        public static final int OP_TYPE_UPDATE_ENV = 10004;
        public static final int OP_TYPE_UPDATE_TAG = 10000;
        public static final int OP_TYPE_WRITE_AD_EVENT = 10010;
        public static final int OP_TYPE_WRITE_MD_BEGIN_EVENT = 10011;
        public static final int OP_TYPE_WRITE_MD_COMMIT_EVENT = 10015;
        public static final int OP_TYPE_WRITE_MD_MRN_STOP_EVENT = 10014;
        public static final int OP_TYPE_WRITE_MD_START_EVENT = 10012;
        public static final int OP_TYPE_WRITE_MD_STOP_EVENT = 10013;
        public static final int OP_TYPE_WRITE_MMP_EVENT = 10016;
        public static final int OP_TYPE_WRITE_WEB_EVENT = 10009;
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class OP_TYPE_GESTURE {
        public static final int OP_TYPE_SAVE_GESTURE = 50000;
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class OP_TYPE_INDEPENDENT_PROCESS {
        public static final int OP_TYPE_SEND_SYNC_INFO = 60000;
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class OP_TYPE_STATISTICS {
        public static final int OP_TYPE_ACTIVITY_ON_CREATE = 30004;
        public static final int OP_TYPE_ACTIVITY_ON_DESTROY = 30009;
        public static final int OP_TYPE_ACTIVITY_ON_PAUSE = 30008;
        public static final int OP_TYPE_ACTIVITY_ON_RESUME = 30007;
        public static final int OP_TYPE_ACTIVITY_ON_START = 30005;
        public static final int OP_TYPE_ACTIVITY_ON_STOP = 30006;
        public static final int OP_TYPE_GET_CID = 30023;
        public static final int OP_TYPE_GET_CUSTOM_ENV = 30024;
        public static final int OP_TYPE_GET_DEFAULT_CHANNEL_NAME = 30002;
        public static final int OP_TYPE_GET_DEFAULT_ENV = 30022;
        public static final int OP_TYPE_GET_PAGE_NAME = 30013;
        public static final int OP_TYPE_GET_REF_PAGE_NAME = 30014;
        public static final int OP_TYPE_GET_REF_REQUEST_ID = 30012;
        public static final int OP_TYPE_GET_REQUEST_ID = 30010;
        public static final int OP_TYPE_GET_REQUEST_ID_FOR_PAGE = 30011;
        public static final int OP_TYPE_GET_SESSION = 30020;
        public static final int OP_TYPE_JS_TO_NATIVE = 30017;
        public static final int OP_TYPE_MMP_TO_NATIVE = 30018;
        public static final int OP_TYPE_RESET_PAGE_IDENTIFY = 30015;
        public static final int OP_TYPE_RESET_PAGE_NAME = 30016;
        public static final int OP_TYPE_SET_DEFAULT_CATEGORY = 30001;
        public static final int OP_TYPE_SET_DEFAULT_CHANNEL_NAME = 30003;
        public static final int OP_TYPE_SET_VALLAB = 30019;
        public static final int OP_TYPE_UPDATE_ENV = 30000;
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class OP_TYPE_TAG {
        public static final int OP_TYPE_CLEAR_CONTAINER_TAG = 40006;
        public static final int OP_TYPE_CLEAR_TAG = 40005;
        public static final int OP_TYPE_CLEAR_TAG_MMPID = 40008;
        public static final int OP_TYPE_CLEAR_TAG_MMPID_PAGEID = 40009;
        public static final int OP_TYPE_GET_CURRENT_PAGE_NAME = 40007;
        public static final int OP_TYPE_GET_TAG = 40004;
        public static final int OP_TYPE_INSERT_PAGE_NAME = 40000;
        public static final int OP_TYPE_REMOVE_TAG = 40003;
        public static final int OP_TYPE_UPDATE_PAGE_NAME = 40001;
        public static final int OP_TYPE_WRITE_TAG = 40002;
        public static ChangeQuickRedirect changeQuickRedirect;
    }
}
