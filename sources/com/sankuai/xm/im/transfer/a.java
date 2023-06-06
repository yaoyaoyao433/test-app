package com.sankuai.xm.im.transfer;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.k;
import com.sankuai.xm.file.a;
import com.sankuai.xm.file.proxy.f;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    public void init(Context context, int i, String str) {
        Object[] objArr = {context, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "17e37c4fa61ee3a3cd408d73fc70e6be", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "17e37c4fa61ee3a3cd408d73fc70e6be");
            return;
        }
        com.sankuai.xm.file.a aVar = a.C1381a.a;
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.file.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "744f60d737d332b9d9fd0d2a88aa30c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "744f60d737d332b9d9fd0d2a88aa30c0");
        } else if (aVar.b.compareAndSet(false, true)) {
            aVar.f = context.getApplicationContext();
            aVar.e = k.j("cache/agent/").getAbsolutePath();
        }
        com.sankuai.xm.file.a aVar2 = a.C1381a.a;
        Object[] objArr3 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.xm.file.a.a;
        if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect4, false, "bdc02837a2647a8d97f83dbf72d92806", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect4, false, "bdc02837a2647a8d97f83dbf72d92806");
        } else {
            f.a((short) i);
        }
        com.sankuai.xm.file.a aVar3 = a.C1381a.a;
        Object[] objArr4 = {str};
        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.xm.file.a.a;
        if (PatchProxy.isSupport(objArr4, aVar3, changeQuickRedirect5, false, "a8518dab4cb6d967fea5b99b2572412c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr4, aVar3, changeQuickRedirect5, false, "a8518dab4cb6d967fea5b99b2572412c");
        } else {
            f.a(str);
        }
    }

    public void setUidAndToken(long j, String str, String str2, String str3) {
        Object[] objArr = {new Long(j), str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44f64b0707fa8850cbcacc77ff2265e4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44f64b0707fa8850cbcacc77ff2265e4");
            return;
        }
        com.sankuai.xm.file.a aVar = a.C1381a.a;
        Object[] objArr2 = {new Long(j), str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.file.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "de2fc0215f02b76ef81555478852dc16", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "de2fc0215f02b76ef81555478852dc16");
        } else {
            f.a(j, str, str2, str3);
        }
    }
}
