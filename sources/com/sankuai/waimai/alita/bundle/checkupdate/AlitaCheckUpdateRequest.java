package com.sankuai.waimai.alita.bundle.checkupdate;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.meituan.retrofit2.raw.a;
import com.sankuai.waimai.alita.bundle.download.update.BundleInfo;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class AlitaCheckUpdateRequest {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String app;
    public String appVersion;
    public List<BundleInfo> bundles;
    public a.InterfaceC0637a callFactory;
    public String channel;
    public boolean isAlitaDevelop;
    public String platform;
    public String sdkVersion;
    public String uuid;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public String b;
        String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public boolean h;
        public List<BundleInfo> i;
        public a.InterfaceC0637a j;
    }

    public AlitaCheckUpdateRequest(a aVar) {
        this.appVersion = aVar.b;
        this.channel = aVar.c;
        this.app = aVar.d;
        this.platform = aVar.e;
        this.uuid = aVar.f;
        this.sdkVersion = aVar.g;
        this.isAlitaDevelop = aVar.h;
        this.bundles = aVar.i;
        this.callFactory = aVar.j;
    }
}
