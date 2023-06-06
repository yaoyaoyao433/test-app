package com.sankuai.waimai.business.restaurant.poicontainer.helper;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class PoiCommentSP {
    public static ChangeQuickRedirect a;
    private static com.sankuai.waimai.foundation.utils.e<CommentSPKey> b = new com.sankuai.waimai.foundation.utils.e<>("waimai_restaurant_comment");

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public enum CommentSPKey {
        POI_TAB_INDEX,
        APP_BACKGROUND,
        POI_COMMENT_TAB_CLICK_TIME;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        public static CommentSPKey valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b49e112167669c60926f2ff2beb9eed2", RobustBitConfig.DEFAULT_VALUE) ? (CommentSPKey) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b49e112167669c60926f2ff2beb9eed2") : (CommentSPKey) Enum.valueOf(CommentSPKey.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static CommentSPKey[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "07b85ac548bb36b735d52bb6e938a9d3", RobustBitConfig.DEFAULT_VALUE) ? (CommentSPKey[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "07b85ac548bb36b735d52bb6e938a9d3") : (CommentSPKey[]) values().clone();
        }

        CommentSPKey() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc72b955fbf23ff03666804a79d485cc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc72b955fbf23ff03666804a79d485cc");
            }
        }
    }

    public static void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e1b34b41e1fdbc25f28a3e9e6c0f78b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e1b34b41e1fdbc25f28a3e9e6c0f78b2");
        } else {
            b.a((com.sankuai.waimai.foundation.utils.e<CommentSPKey>) CommentSPKey.POI_TAB_INDEX, i);
        }
    }

    public static int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b7b5dbdb1c2be734b320d2e448225b50", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b7b5dbdb1c2be734b320d2e448225b50")).intValue() : b.b((com.sankuai.waimai.foundation.utils.e<CommentSPKey>) CommentSPKey.POI_TAB_INDEX, -1);
    }

    public static void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d9bfa7d7432d34ab3ef2d80a71884473", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d9bfa7d7432d34ab3ef2d80a71884473");
        } else {
            b.a((com.sankuai.waimai.foundation.utils.e<CommentSPKey>) CommentSPKey.APP_BACKGROUND, z);
        }
    }

    public static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6f68ae9ea041d21594f91dc7da5f3579", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6f68ae9ea041d21594f91dc7da5f3579")).booleanValue() : b.b((com.sankuai.waimai.foundation.utils.e<CommentSPKey>) CommentSPKey.APP_BACKGROUND, false);
    }

    public static void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a0daf0e436b3bd92529691d49c483309", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a0daf0e436b3bd92529691d49c483309");
        } else {
            b.a((com.sankuai.waimai.foundation.utils.e<CommentSPKey>) CommentSPKey.POI_COMMENT_TAB_CLICK_TIME, System.currentTimeMillis());
        }
    }

    public static long d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2fac7db465af1ed58c4a92b1bd65d6c8", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2fac7db465af1ed58c4a92b1bd65d6c8")).longValue() : b.b((com.sankuai.waimai.foundation.utils.e<CommentSPKey>) CommentSPKey.POI_COMMENT_TAB_CLICK_TIME, System.currentTimeMillis());
    }
}
