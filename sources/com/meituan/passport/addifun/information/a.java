package com.meituan.passport.addifun.information;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.app.FragmentActivity;
import com.meituan.passport.converter.m;
import com.meituan.passport.utils.Utils;
import com.meituan.passport.utils.n;
import com.meituan.passport.utils.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.ByteArrayOutputStream;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(m<String> mVar, FragmentActivity fragmentActivity, Bitmap bitmap) {
        Object[] objArr = {mVar, fragmentActivity, bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f3e349016b4c4b31b04758d5c3220d89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f3e349016b4c4b31b04758d5c3220d89");
        } else if (fragmentActivity == null || bitmap == null) {
            String format = String.format("successCallBacks is null ? [%s]", Boolean.FALSE);
            Object[] objArr2 = new Object[1];
            objArr2[0] = Boolean.valueOf(fragmentActivity == null);
            String format2 = String.format("activity is null ? [%s]", objArr2);
            Object[] objArr3 = new Object[1];
            objArr3[0] = Boolean.valueOf(bitmap == null);
            String format3 = String.format("avatar is null ? [%s]", objArr3);
            n.a("UserAvatarUtils.updateAvatar", "successCallBacks, activity or  avatar is null", format + ", " + format2 + ", " + format3);
        } else {
            n.a("UserAvatarUtils.updateAvatar", "successCallBacks, activity and avatar", "are not null");
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Utils.a((Context) fragmentActivity, 120.0f), Utils.a((Context) fragmentActivity, 120.0f), false);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 75, byteArrayOutputStream);
            Object[] objArr4 = {fragmentActivity, mVar};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            s.a(PatchProxy.isSupport(objArr4, null, changeQuickRedirect2, true, "56e19c7ba21e06ed2bd42aae295ac71e", RobustBitConfig.DEFAULT_VALUE) ? (m) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect2, true, "56e19c7ba21e06ed2bd42aae295ac71e") : new b(fragmentActivity, mVar), fragmentActivity, byteArrayOutputStream.toByteArray());
        }
    }
}
