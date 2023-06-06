package com.sankuai.meituan.mtlive.player.mlvb;

import android.os.Handler;
import android.util.Log;
import com.meituan.android.common.weaver.impl.blank.BlankConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtliveqos.b;
import com.sankuai.meituan.mtliveqos.common.d;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static volatile a g;
    boolean b;
    int c;
    int d;
    List<InterfaceC0615a> e;
    int f;
    private Handler h;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.mtlive.player.mlvb.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0615a {
        void a(boolean z);
    }

    public static /* synthetic */ void d(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "f63b10124ec5d189d1102c1dbbcd6cb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "f63b10124ec5d189d1102c1dbbcd6cb3");
            return;
        }
        for (InterfaceC0615a interfaceC0615a : aVar.e) {
            interfaceC0615a.a(aVar.b);
        }
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "812d8ddbd32ed5620d97529f39c1bd2f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "812d8ddbd32ed5620d97529f39c1bd2f");
            return;
        }
        this.h = new Handler();
        this.d = BlankConfig.MAX_SAMPLE;
        this.e = new ArrayList();
        this.f = 5000;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2fcf64088e828ff7c39a04c3cf1f18f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2fcf64088e828ff7c39a04c3cf1f18f5");
        } else {
            b.a("MTLive_TxPlayer_Config", new d() { // from class: com.sankuai.meituan.mtlive.player.mlvb.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtliveqos.common.d
                public final void a(final boolean z, final String str) {
                    Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "10b0bda7aaf841e41d00e88bd8aa6210", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "10b0bda7aaf841e41d00e88bd8aa6210");
                    } else {
                        a.this.h.post(new Runnable() { // from class: com.sankuai.meituan.mtlive.player.mlvb.a.1.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6353fb06ec798a908b7cebedcac6ae69", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6353fb06ec798a908b7cebedcac6ae69");
                                    return;
                                }
                                new StringBuilder("onChanged: MTLIVE_TxPlayer_Config = ").append(str);
                                if (!z) {
                                    a.this.b = false;
                                    return;
                                }
                                try {
                                    JSONObject jSONObject = new JSONObject(str);
                                    int i = jSONObject.getInt("xlog_switcher_on");
                                    a.this.b = i == 1;
                                    a.this.c = jSONObject.getInt("xlog_upload_limit");
                                    a.this.d = jSONObject.getInt("xlog_video_frozen_threshold");
                                    a.this.f = jSONObject.getInt("clean_duration_after_background");
                                    StringBuilder sb = new StringBuilder("onChanged: xlog_swticher_on: ");
                                    sb.append(i);
                                    sb.append(", MTLIVE_XLOG_UPLOAD_LIMIT: ");
                                    sb.append(a.this.c);
                                    sb.append(",xlogVideoFrozenThreshold : ");
                                    sb.append(a.this.d);
                                    sb.append(",clean_duration_after_background: ");
                                    sb.append(a.this.f);
                                    a.d(a.this);
                                } catch (JSONException e) {
                                    Log.e("HornManager", "ERROR = ", e);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3f15524bb5a724d926981f4c9ef99e71", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3f15524bb5a724d926981f4c9ef99e71");
        }
        if (g == null) {
            synchronized (a.class) {
                if (g == null) {
                    g = new a();
                }
            }
        }
        return g;
    }
}
