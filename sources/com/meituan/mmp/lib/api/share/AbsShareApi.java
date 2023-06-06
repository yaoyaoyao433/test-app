package com.meituan.mmp.lib.api.share;

import com.meituan.mmp.lib.api.ApiFunction;
import com.meituan.mmp.lib.api.Empty;
import com.meituan.mmp.main.d;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class AbsShareApi {

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class AbsMtShare extends ApiFunction<ShareApiParams, Empty> {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class AbsShare extends ApiFunction<ShareApiParams, Empty> {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class ShareApiParams implements d {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String appId;
        public String btnText;
        public String channel;
        public String cid;
        public String content;
        public String imageUrl;
        public String miniProgramPath;
        public String path;
        public String sceneToken;
        public String title;
        public String type;
        public String url;
        public boolean withShareTicket;
    }
}
