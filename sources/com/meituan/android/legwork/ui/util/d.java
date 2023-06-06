package com.meituan.android.legwork.ui.util;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.meituan.android.legwork.bean.LegworkThemeBean;
import com.meituan.android.legwork.bean.TabThemeBean;
import com.meituan.android.legwork.utils.x;
import com.meituan.android.legwork.utils.y;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.PicassoDrawable;
import com.squareup.picasso.PicassoDrawableTarget;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d {
    public static ChangeQuickRedirect a = null;
    private static String b = "LegworkThemeUtil";
    private static List<TabThemeBean> c = new ArrayList();

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "501517cb69d9fc05466ad450c01b8029", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "501517cb69d9fc05466ad450c01b8029");
            return;
        }
        y a2 = y.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = y.a;
        a(PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "50ab86e6e81e0b60cdd9d2bb59bba579", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "50ab86e6e81e0b60cdd9d2bb59bba579") : a2.b("homeSkinCache", ""));
    }

    public static int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a2257c4b83ef044774bb5bb4ea88ce96", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a2257c4b83ef044774bb5bb4ea88ce96")).intValue() : c.size();
    }

    public static TabThemeBean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0b61e4c6c31fbfcd9baf64b44030d85a", RobustBitConfig.DEFAULT_VALUE)) {
            return (TabThemeBean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0b61e4c6c31fbfcd9baf64b44030d85a");
        }
        if (i < 0 || i >= c.size()) {
            return null;
        }
        return c.get(i);
    }

    public static boolean a(String str) {
        LegworkThemeBean legworkThemeBean;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "497a68fe3de6ae015b1c6b76a623bac4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "497a68fe3de6ae015b1c6b76a623bac4")).booleanValue();
        }
        if (c.isEmpty() && TextUtils.isEmpty(str)) {
            return false;
        }
        if (TextUtils.isEmpty(str) && !c.isEmpty()) {
            c.clear();
            return true;
        }
        try {
            legworkThemeBean = (LegworkThemeBean) com.meituan.android.legwork.net.util.b.a().fromJson(str, (Class<Object>) LegworkThemeBean.class);
        } catch (Exception e) {
            String str2 = b;
            x.e(str2, "loadThemeFromCache error,msg:" + e.getMessage());
            x.a(e);
            legworkThemeBean = null;
        }
        if (!b(legworkThemeBean)) {
            c.clear();
            return true;
        } else if (a(legworkThemeBean)) {
            return false;
        } else {
            c.clear();
            c.add(new TabThemeBean(legworkThemeBean.bottomAreaHomeButtonSelected, legworkThemeBean.bottomAreaHomeButtonUnSelected));
            c.add(new TabThemeBean(legworkThemeBean.bottomAreaOrderButtonSelected, legworkThemeBean.bottomAreaOrderButtonUnSelected));
            c.add(new TabThemeBean(legworkThemeBean.bottomAreaMyButtonSelected, legworkThemeBean.bottomAreaMyButtonUnSelected));
            b(legworkThemeBean.bottomAreaHomeButtonSelected);
            b(legworkThemeBean.bottomAreaOrderButtonSelected);
            b(legworkThemeBean.bottomAreaMyButtonSelected);
            return true;
        }
    }

    private static boolean a(LegworkThemeBean legworkThemeBean) {
        Object[] objArr = {legworkThemeBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "15a4dfa520d124459144a106a20f67c3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "15a4dfa520d124459144a106a20f67c3")).booleanValue();
        }
        if (!c.isEmpty() || legworkThemeBean == null) {
            for (int i = 0; i < c.size(); i++) {
                TabThemeBean tabThemeBean = c.get(i);
                switch (i) {
                    case 0:
                        if (TextUtils.equals(tabThemeBean.selectUrl, legworkThemeBean.bottomAreaHomeButtonSelected) && TextUtils.equals(tabThemeBean.unSelectUrl, legworkThemeBean.bottomAreaHomeButtonUnSelected)) {
                            break;
                        } else {
                            return false;
                        }
                    case 1:
                        if (TextUtils.equals(tabThemeBean.selectUrl, legworkThemeBean.bottomAreaOrderButtonSelected) && TextUtils.equals(tabThemeBean.unSelectUrl, legworkThemeBean.bottomAreaOrderButtonUnSelected)) {
                            break;
                        } else {
                            return false;
                        }
                        break;
                    case 2:
                        if (TextUtils.equals(tabThemeBean.selectUrl, legworkThemeBean.bottomAreaMyButtonSelected) && TextUtils.equals(tabThemeBean.unSelectUrl, legworkThemeBean.bottomAreaMyButtonUnSelected)) {
                            break;
                        } else {
                            return false;
                        }
                    default:
                        return false;
                }
            }
            return true;
        }
        return false;
    }

    private static boolean b(LegworkThemeBean legworkThemeBean) {
        long j;
        Object[] objArr = {legworkThemeBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "95335ce8ecb8e8d78af23c60ded96780", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "95335ce8ecb8e8d78af23c60ded96780")).booleanValue();
        }
        if (legworkThemeBean == null || legworkThemeBean.startTime == null || legworkThemeBean.endTime == null) {
            return false;
        }
        long j2 = 0;
        try {
            j = Long.parseLong(legworkThemeBean.startTime);
        } catch (Exception e) {
            e = e;
            j = 0;
        }
        try {
            j2 = Long.parseLong(legworkThemeBean.endTime);
        } catch (Exception e2) {
            e = e2;
            x.e(b, "isThemeCacheOk error,msg:" + e.getMessage());
            x.a(e);
            long b2 = com.meituan.android.time.c.b() / 1000;
            if (j <= b2) {
            }
        }
        long b22 = com.meituan.android.time.c.b() / 1000;
        return (j <= b22 || b22 > j2 || legworkThemeBean.bottomAreaHomeButtonSelected == null || legworkThemeBean.bottomAreaHomeButtonUnSelected == null || legworkThemeBean.bottomAreaOrderButtonSelected == null || legworkThemeBean.bottomAreaOrderButtonUnSelected == null || legworkThemeBean.bottomAreaMyButtonSelected == null || legworkThemeBean.bottomAreaMyButtonUnSelected == null) ? false : true;
    }

    public static void a(final ImageView imageView, String str) {
        Object[] objArr = {imageView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f7a2001ec4b35dae269f10d07b9a3e5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f7a2001ec4b35dae269f10d07b9a3e5d");
            return;
        }
        imageView.setImageDrawable(null);
        Picasso.g(com.meituan.android.legwork.a.c).d(str).a(new PicassoDrawableTarget() { // from class: com.meituan.android.legwork.ui.util.d.1
            public static ChangeQuickRedirect a;

            @Override // com.squareup.picasso.PicassoDrawableTarget
            public final void onLoadFailed(Exception exc, Drawable drawable) {
            }

            @Override // com.squareup.picasso.PicassoDrawableTarget
            public final void onLoadStarted(Drawable drawable) {
            }

            @Override // com.squareup.picasso.PicassoDrawableTarget
            public final void onResourceReady(PicassoDrawable picassoDrawable, Picasso.LoadedFrom loadedFrom) {
                Object[] objArr2 = {picassoDrawable, loadedFrom};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "345183c652d1711a5834b173ecfc93b9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "345183c652d1711a5834b173ecfc93b9");
                    return;
                }
                try {
                    picassoDrawable.a(1);
                    imageView.setImageDrawable(picassoDrawable);
                    picassoDrawable.start();
                } catch (Exception e) {
                    x.e("LegworkThemeUtil.loadThemeWebPImage()", "exception msg:", e);
                    x.a(e);
                }
            }
        });
    }

    private static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f2a0e302665a1dbd88e1162210062b4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f2a0e302665a1dbd88e1162210062b4c");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            Picasso.g(com.meituan.android.legwork.a.c).d(str).k();
        }
    }
}
