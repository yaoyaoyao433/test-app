package com.meituan.android.pay.desk.pack;

import android.app.Activity;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.meituan.android.pay.desk.component.data.DeskData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements CompoundButton.OnCheckedChangeListener {
    public static ChangeQuickRedirect a;
    private final c b;
    private final Activity c;
    private final LinearLayout d;
    private final DeskData e;
    private final HashMap f;

    private d(c cVar, Activity activity, LinearLayout linearLayout, DeskData deskData, HashMap hashMap) {
        this.b = cVar;
        this.c = activity;
        this.d = linearLayout;
        this.e = deskData;
        this.f = hashMap;
    }

    public static CompoundButton.OnCheckedChangeListener a(c cVar, Activity activity, LinearLayout linearLayout, DeskData deskData, HashMap hashMap) {
        Object[] objArr = {cVar, activity, linearLayout, deskData, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3459105f733bf1a18fae5e75f8e99f8e", RobustBitConfig.DEFAULT_VALUE) ? (CompoundButton.OnCheckedChangeListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3459105f733bf1a18fae5e75f8e99f8e") : new d(cVar, activity, linearLayout, deskData, hashMap);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Object[] objArr = {compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7afa46d2431196069f1951d797ef4b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7afa46d2431196069f1951d797ef4b5");
            return;
        }
        c cVar = this.b;
        Activity activity = this.c;
        LinearLayout linearLayout = this.d;
        DeskData deskData = this.e;
        HashMap<String, String> hashMap = this.f;
        Object[] objArr2 = {cVar, activity, linearLayout, deskData, hashMap, compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "989a3d861482e81fdd48e0102498279b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "989a3d861482e81fdd48e0102498279b");
        } else {
            cVar.a(activity, linearLayout, deskData, hashMap);
        }
    }
}
