package com.meituan.msi.api.extension.sgc.common;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class SyncPoiInfoParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    @MsiParamChecker(required = true)
    public Request request;
    @MsiParamChecker(required = true)
    public Response response;

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class Request {
        public static ChangeQuickRedirect changeQuickRedirect;
        @MsiParamChecker(required = true)
        public String request_poi_id;
        @MsiParamChecker(required = true)
        public String request_poi_id_str;
    }

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class Response {
        public static ChangeQuickRedirect changeQuickRedirect;
        @MsiParamChecker(required = true)
        public String response_poi_id;
        @MsiParamChecker(required = true)
        public String response_poi_id_str;
    }
}
