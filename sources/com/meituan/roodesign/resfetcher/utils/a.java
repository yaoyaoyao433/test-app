package com.meituan.roodesign.resfetcher.utils;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import android.text.TextUtils;
import android.util.Pair;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    private static ByteBuffer a(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9acb19a4618559a8490d18075918fa11", RobustBitConfig.DEFAULT_VALUE)) {
            return (ByteBuffer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9acb19a4618559a8490d18075918fa11");
        }
        ByteBuffer order = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
        order.put((byte) 1);
        order.put((byte) 2);
        order.put((byte) 2);
        order.put((byte) 9);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(i2);
        order.putInt(i4);
        order.putInt(i);
        order.putInt(i3);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        return order;
    }

    public static NinePatchDrawable a(Resources resources, Bitmap bitmap, int i, int i2, String str) {
        Object[] objArr = {resources, bitmap, Integer.valueOf(i), Integer.valueOf(i2), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "15a590450c0db960eb549ef9b3e4298b", RobustBitConfig.DEFAULT_VALUE) ? (NinePatchDrawable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "15a590450c0db960eb549ef9b3e4298b") : new NinePatchDrawable(resources, bitmap, a(i, i2, i + 1, i2 + 1).array(), new Rect(), str);
    }

    public static Pair<Integer, Integer> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8e6dc833b1dc6e14ae22cb0900c3efe7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8e6dc833b1dc6e14ae22cb0900c3efe7");
        }
        if (TextUtils.isEmpty(str) || !str.contains("@")) {
            return null;
        }
        String str2 = str.split("@")[1];
        if (TextUtils.isEmpty(str2) || !str2.contains(Constants.GestureMoveEvent.KEY_X)) {
            return null;
        }
        String[] split = str2.split(Constants.GestureMoveEvent.KEY_X);
        if (split.length == 2) {
            return new Pair<>(Integer.valueOf(Integer.parseInt(split[0])), Integer.valueOf(Integer.parseInt(split[1])));
        }
        return null;
    }

    public static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "83dbf3e34829401e1cf7c993453767ad", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "83dbf3e34829401e1cf7c993453767ad") : (TextUtils.isEmpty(str) || !str.contains("@")) ? str : str.split("@")[0];
    }
}
