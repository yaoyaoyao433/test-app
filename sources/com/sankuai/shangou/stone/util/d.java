package com.sankuai.shangou.stone.util;

import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.support.annotation.FloatRange;
import android.support.v4.view.ViewCompat;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;

    @ColorInt
    public static int a(String str, @ColorInt int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "908fa4ded5f6df8a0fdaa69d6ab03ce7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "908fa4ded5f6df8a0fdaa69d6ab03ce7")).intValue();
        }
        try {
            return t.a(str) ? i : Color.parseColor(str);
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
            return i;
        }
    }

    @ColorInt
    public static Integer a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "28acf720e35c86836eafb606c9e998e1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "28acf720e35c86836eafb606c9e998e1");
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (Exception e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
            }
        }
        return null;
    }

    @ColorInt
    public static int a(@ColorInt int i, @FloatRange(from = 0.0d, to = 1.0d) float f) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e2aa5d6754e16d420f23f8b22617c964", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e2aa5d6754e16d420f23f8b22617c964")).intValue();
        }
        byte a2 = (byte) (n.a(f, 0.0f, 1.0f) * 255.0f);
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(a2)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1f04263a3227775fe750e4e94f6f9a90", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1f04263a3227775fe750e4e94f6f9a90")).intValue() : (a2 << 24) | (i & ViewCompat.MEASURED_SIZE_MASK);
    }
}
