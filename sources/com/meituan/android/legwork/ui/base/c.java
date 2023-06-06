package com.meituan.android.legwork.ui.base;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.legwork.common.util.PmUtil;
import com.meituan.android.legwork.ui.activity.ToSendOneMoreActivity;
import com.meituan.android.legwork.ui.jump.d;
import com.meituan.android.legwork.ui.jump.f;
import com.meituan.android.legwork.ui.jump.g;
import com.meituan.android.legwork.utils.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;

    @Nullable
    public static String a(@Nonnull final Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf8d76305f3c546a5016c30b2a85720c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf8d76305f3c546a5016c30b2a85720c") : (String) PmUtil.a(new PmUtil.a<String>() { // from class: com.meituan.android.legwork.ui.base.c.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.legwork.common.util.PmUtil.a
            public final /* bridge */ /* synthetic */ String d() {
                return null;
            }

            @Override // com.meituan.android.legwork.common.util.PmUtil.a
            public final /* synthetic */ String a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ecf701b3697c8d6dbf6dac929ed0cd83", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ecf701b3697c8d6dbf6dac929ed0cd83") : uri.getPath();
            }

            @Override // com.meituan.android.legwork.common.util.PmUtil.a
            public final /* synthetic */ String b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f983dd5041e4cafb2b4205777bdc6999", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f983dd5041e4cafb2b4205777bdc6999") : uri.getPath();
            }

            @Override // com.meituan.android.legwork.common.util.PmUtil.a
            public final /* synthetic */ String c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3b3dbc4cfd96095c216c716485df231c", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3b3dbc4cfd96095c216c716485df231c");
                }
                String path = uri.getPath();
                return TextUtils.isEmpty(path) ? uri.getHost() : path;
            }
        });
    }

    @NonNull
    public static b a(@NonNull ToSendOneMoreActivity toSendOneMoreActivity) {
        Object[] objArr = {toSendOneMoreActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9b60268b53afae23e82058bf44e54ca7", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9b60268b53afae23e82058bf44e54ca7");
        }
        if (toSendOneMoreActivity.getIntent() == null || toSendOneMoreActivity.getIntent().getData() == null) {
            return new com.meituan.android.legwork.ui.jump.a(toSendOneMoreActivity);
        }
        String a2 = a(toSendOneMoreActivity.getIntent().getData());
        String string = toSendOneMoreActivity.getString(R.string.legwork_scheme_path_order_pay_tmp);
        String string2 = toSendOneMoreActivity.getString(R.string.legwork_scheme_path_im);
        String string3 = toSendOneMoreActivity.getString(R.string.legwork_scheme_path_invoice_order_list);
        String string4 = toSendOneMoreActivity.getString(R.string.legwork_scheme_path_web_coupon);
        String string5 = toSendOneMoreActivity.getString(R.string.legwork_scheme_path_poi_confirm);
        String string6 = toSendOneMoreActivity.getString(R.string.legwork_scheme_path_mrn_degrade);
        String string7 = toSendOneMoreActivity.getString(R.string.legwork_scheme_path_mrn);
        if (TextUtils.equals(a2, string) || TextUtils.equals(a2, string2) || TextUtils.equals(a2, string3) || TextUtils.equals(a2, string4)) {
            return new g(toSendOneMoreActivity);
        }
        if (TextUtils.equals(a2, string5)) {
            return new f(toSendOneMoreActivity);
        }
        if (TextUtils.equals(a2, string6)) {
            return new com.meituan.android.legwork.ui.jump.c(toSendOneMoreActivity);
        }
        if (TextUtils.equals(a2, string7)) {
            Intent a3 = com.meituan.android.legwork.mrn.b.a().a(toSendOneMoreActivity, toSendOneMoreActivity.getIntent().getDataString(), (Map<String, Object>) null);
            if (a3 != null && a3.getData() != null && TextUtils.equals(a(a3.getData()), string6)) {
                toSendOneMoreActivity.setIntent(a3);
                return new com.meituan.android.legwork.ui.jump.c(toSendOneMoreActivity);
            }
            return new d(toSendOneMoreActivity);
        }
        Intent a4 = com.meituan.android.legwork.utils.d.a(toSendOneMoreActivity);
        if (a(a4)) {
            toSendOneMoreActivity.setIntent(a4);
            return new d(toSendOneMoreActivity);
        }
        Intent a5 = t.a(toSendOneMoreActivity);
        if (a(a5)) {
            toSendOneMoreActivity.setIntent(a5);
            return new d(toSendOneMoreActivity);
        }
        Intent a6 = com.meituan.android.legwork.utils.c.a(toSendOneMoreActivity);
        if (a(a6)) {
            toSendOneMoreActivity.setIntent(a6);
            return new d(toSendOneMoreActivity);
        }
        return new com.meituan.android.legwork.ui.jump.a(toSendOneMoreActivity);
    }

    private static boolean a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "57247ef0a81a0fa18f8da4c27efc6e2e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "57247ef0a81a0fa18f8da4c27efc6e2e")).booleanValue();
        }
        if (intent == null || intent.getData() == null) {
            return false;
        }
        return com.meituan.android.legwork.a.a().getString(R.string.legwork_scheme_path_mrn).equals(a(intent.getData()));
    }
}
