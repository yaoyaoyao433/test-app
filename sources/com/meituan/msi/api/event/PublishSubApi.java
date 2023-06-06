package com.meituan.msi.api.event;

import android.text.TextUtils;
import com.dianping.titans.utils.Constants;
import com.google.gson.JsonObject;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.dispather.e;
import com.meituan.msi.event.b;
import com.meituan.msi.lifecycle.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PublishSubApi implements IMsiApi, a {
    public static ChangeQuickRedirect a;
    private e b;
    private b c;

    @Override // com.meituan.msi.lifecycle.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6689d4c252e0093829ab5bd5ac7f3da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6689d4c252e0093829ab5bd5ac7f3da");
        }
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae1bffcbdcd8c550925c2ce1b694c2b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae1bffcbdcd8c550925c2ce1b694c2b2");
        }
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47f387cf3074a0e7e4100c04c10e9dd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47f387cf3074a0e7e4100c04c10e9dd6");
        }
    }

    @MsiApiMethod(isCallback = true, name = "onPublish", response = PublishResponse.class)
    public void onPublish(MsiContext msiContext) {
    }

    public PublishSubApi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46ae925f9b83cb9158c9e471cf87dd39", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46ae925f9b83cb9158c9e471cf87dd39");
            return;
        }
        this.b = null;
        this.c = new b() { // from class: com.meituan.msi.api.event.PublishSubApi.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msi.event.b
            public final void a(String str, String str2, JsonObject jsonObject, String str3) {
                Object[] objArr2 = {str, str2, jsonObject, str3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9be28cabf6af35f550519d52bdca3d49", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9be28cabf6af35f550519d52bdca3d49");
                } else if (PublishSubApi.this.b != null) {
                    PublishResponse publishResponse = new PublishResponse();
                    publishResponse.eventName = str;
                    publishResponse.scope = str2;
                    publishResponse.data = jsonObject;
                    PublishSubApi.this.b.a("default", "onPublish", publishResponse);
                }
            }
        };
    }

    @MsiApiMethod(name = "subscribe", request = SubscribeParam.class)
    public void subscribe(SubscribeParam subscribeParam, MsiContext msiContext) {
        boolean z = false;
        Object[] objArr = {subscribeParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8700b6217122436e8c4eb9b33ca9ed0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8700b6217122436e8c4eb9b33ca9ed0");
            return;
        }
        if (this.b == null) {
            this.b = msiContext.getEventDispatcher();
        }
        com.meituan.msi.event.a a2 = com.meituan.msi.event.a.a();
        String str = subscribeParam.eventName;
        String str2 = subscribeParam.scope;
        b bVar = this.c;
        Object[] objArr2 = {str, str2, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msi.event.a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "c7df61255b4041a3878125fe037c036c", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "c7df61255b4041a3878125fe037c036c")).booleanValue();
        } else {
            String a3 = a2.a(str, str2);
            if (!TextUtils.isEmpty(a3)) {
                Set<b> set = a2.c.containsKey(a3) ? a2.c.get(a3) : null;
                if (set == null) {
                    set = new CopyOnWriteArraySet<>();
                    a2.c.put(a3, set);
                }
                if (!set.contains(bVar)) {
                    set.add(bVar);
                }
                z = true;
            }
        }
        if (z) {
            msiContext.onSuccess("");
        } else {
            msiContext.onError("Subscribe Failed:" + subscribeParam.eventName + StringUtil.SPACE + subscribeParam.scope);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", subscribeParam.eventName);
        hashMap.put("eventScope", subscribeParam.scope);
        hashMap.put("eventFrom", "fe");
        com.meituan.msi.log.a.a(hashMap, msiContext.request);
    }

    @MsiApiMethod(name = "unsubscribe", request = SubscribeParam.class)
    public void unsubscribe(SubscribeParam subscribeParam, MsiContext msiContext) {
        Object[] objArr = {subscribeParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52de0767b75809d0d935f7aecb41d08b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52de0767b75809d0d935f7aecb41d08b");
            return;
        }
        com.meituan.msi.event.a.a().a(subscribeParam.eventName, subscribeParam.scope, this.c);
        msiContext.onSuccess("");
    }

    @MsiApiMethod(name = Constants.MULTI_PROCESS_PUBLISH_DATA, request = PublishParam.class)
    public void publish(PublishParam publishParam, MsiContext msiContext) {
        Object[] objArr = {publishParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7c84df026c86e72804ca9418a8f5ce7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7c84df026c86e72804ca9418a8f5ce7");
            return;
        }
        com.meituan.msi.event.a a2 = com.meituan.msi.event.a.a();
        String str = publishParam.eventName;
        String str2 = publishParam.scope;
        JsonObject jsonObject = publishParam.data;
        boolean z = publishParam.supportMultiProcess;
        Object[] objArr2 = {str, str2, jsonObject, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msi.event.a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "c848bfcc0f394a434171d55800254068", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "c848bfcc0f394a434171d55800254068");
        } else {
            a2.a(str, str2, jsonObject, z, "MSI");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", publishParam.eventName);
        hashMap.put("eventScope", publishParam.scope);
        hashMap.put("eventFrom", "fe");
        hashMap.put("supportMultiProcess", Boolean.valueOf(publishParam.supportMultiProcess));
        com.meituan.msi.log.a.a(hashMap, msiContext.request);
        msiContext.onSuccess("");
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42ee1aabf9ed1957bef8b41bbbd4606f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42ee1aabf9ed1957bef8b41bbbd4606f");
        } else {
            com.meituan.msi.event.a.a().a(null, null, this.c);
        }
    }
}
