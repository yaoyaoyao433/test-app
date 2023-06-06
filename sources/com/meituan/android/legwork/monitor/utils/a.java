package com.meituan.android.legwork.monitor.utils;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MapView;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static StringBuilder a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        BufferedReader bufferedReader = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "51f8a152404c92286995cf0ebfd0a902", RobustBitConfig.DEFAULT_VALUE)) {
            return (StringBuilder) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "51f8a152404c92286995cf0ebfd0a902");
        }
        File file = new File(str);
        StringBuilder sb = new StringBuilder("");
        try {
            if (!file.isFile()) {
                return null;
            }
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file), str2));
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine != null) {
                            if (!sb.toString().equals("")) {
                                sb.append(StringUtil.CRLF_STRING);
                            }
                            sb.append(readLine);
                        } else {
                            bufferedReader2.close();
                            try {
                                bufferedReader2.close();
                                return sb;
                            } catch (IOException e) {
                                throw new RuntimeException("IOException occurred. ", e);
                            }
                        }
                    } catch (IOException e2) {
                        e = e2;
                        throw new RuntimeException("IOException occurred. ", e);
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e3) {
                                throw new RuntimeException("IOException occurred. ", e3);
                            }
                        }
                        throw th;
                    }
                }
            } catch (IOException e4) {
                e = e4;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Nullable
    public static k a(MapView mapView, int i) {
        Object[] objArr = {mapView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "de1f2b4ebee4ad8e9d7071c739a6b53b", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "de1f2b4ebee4ad8e9d7071c739a6b53b");
        }
        if (com.meituan.android.legwork.a.a() == null || q.a(com.meituan.android.legwork.a.a(), "banma", "") == null || mapView == null || i == 1) {
            return null;
        }
        Object[] objArr2 = {mapView, "sankuai://tile/style?id=bootstrap_paotui_light1"};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f80f531e59e2b227015f599eae392f29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f80f531e59e2b227015f599eae392f29");
        } else if (mapView != null && !TextUtils.isEmpty("sankuai://tile/style?id=bootstrap_paotui_light1")) {
            try {
                mapView.setCustomMapStylePath("sankuai://tile/style?id=bootstrap_paotui_light1");
                mapView.setMapCustomEnable(true);
            } catch (Exception e) {
                x.a(e);
                x.e("FileUtil.setCustomMap()", "自定义地图设置失败, exception msg:", e);
            }
        }
        return null;
    }
}
