package com.sankuai.waimai.business.page.home.helper;

import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.model.NavigateItem;
import com.tencent.liteav.audio.TXEAudioDef;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a;
    private static List<NavigateItem> b = new ArrayList<NavigateItem>() { // from class: com.sankuai.waimai.business.page.home.helper.f.1
        {
            String f = com.sankuai.waimai.foundation.router.interfaces.d.f(com.meituan.android.singleton.b.a);
            String string = com.meituan.android.singleton.b.a.getString(R.string.wm_page_home_ni_cate);
            add(new NavigateItem(910, 8967, "https://p1.meituan.net/travelcube/0e065fb5a81b06b0d421b235a384718824211.png", string, f + com.meituan.android.singleton.b.a.getString(R.string.wm_page_kingkong_scheme_prefix)));
            String string2 = com.meituan.android.singleton.b.a.getString(R.string.wm_page_home_ni_dessert_drink);
            add(new NavigateItem(19, 9006, "https://p1.meituan.net/travelcube/e140d7ed467ebe15b43250871c40743125163.png", string2, f + com.meituan.android.singleton.b.a.getString(R.string.wm_page_kingkong_scheme_prefix)));
            String string3 = com.meituan.android.singleton.b.a.getString(R.string.wm_page_home_ni_meituan_supermarket);
            add(new NavigateItem(102620, 9010, "https://p0.meituan.net/travelcube/c51fbbf9421e306dae11a8ba98eaff588272.png", string3, f + com.meituan.android.singleton.b.a.getString(R.string.wm_page_kingkong_supermarket_scheme_prefix)));
            String string4 = com.meituan.android.singleton.b.a.getString(R.string.wm_page_home_ni_fresh_fruits_vegetables);
            add(new NavigateItem(101578, 9043, "https://p0.meituan.net/travelcube/84205ecea896143f61fb603d34e9208123332.png", string4, f + com.meituan.android.singleton.b.a.getString(R.string.wm_page_kingkong_store_scheme_prefix)));
            String string5 = com.meituan.android.singleton.b.a.getString(R.string.wm_page_home_ni_drug_delivery);
            add(new NavigateItem(102530, 9051, "https://p0.meituan.net/travelcube/bfaa888fb8881f8a263ad4e3a27a394923159.png", string5, f + com.meituan.android.singleton.b.a.getString(R.string.wm_page_kingkong_scheme_prefix)));
            add(new NavigateItem(102657, 9432, "https://p0.meituan.net/travelcube/08c111464be3c1eab13be0ea13033f1c13291.png", "津贴联盟", f + "/mrn?mrn_biz=waimai&mrn_entry=ad-subwxapp&mrn_component=waimai-ad-fe-subwxapp&entry_page=sub_pages/ad/allowance_center/index&entry=0&fst_cate_id=金刚code"));
            add(new NavigateItem(104301, 9434, "https://p1.meituan.net/travelcube/a27fca7c1c5158a5b45f9decc281334617709.png", "买酒", f + com.meituan.android.singleton.b.a.getString(R.string.wm_page_kingkong_scheme_prefix)));
            String string6 = com.meituan.android.singleton.b.a.getString(R.string.wm_page_home_ni_meituan_courier);
            add(new NavigateItem(TXEAudioDef.TXE_OPUS_SAMPLE_NUM, 9278, "https://p1.meituan.net/travelcube/6138eb5a4ed927a239058bdee578e66b12025.png", string6, f + com.meituan.android.singleton.b.a.getString(R.string.wm_page_kingkong_scheme_prefix)));
            add(new NavigateItem(104666, 9208, "https://p0.meituan.net/travelcube/792d0d10388e83bd958845838597017411988.png", "果切果捞", f + com.meituan.android.singleton.b.a.getString(R.string.wm_page_kingkong_scheme_prefix)));
            add(new NavigateItem(102529, 9256, "https://p0.meituan.net/travelcube/733269b83874475648b8d683573a4b1c11271.png", "浪漫鲜花", f + com.meituan.android.singleton.b.a.getString(R.string.wm_page_kingkong_scheme_prefix)));
            add(new NavigateItem(100062, 9213, "https://p0.meituan.net/travelcube/93993a1c18a291dda93f14dcd927900d12470.png", "汉堡披萨", f + com.meituan.android.singleton.b.a.getString(R.string.wm_page_kingkong_scheme_prefix)));
            add(new NavigateItem(100325, 9243, "https://p0.meituan.net/travelcube/d587c96252f6167ba6ba4325d803391410913.png", "快食简餐", f + com.meituan.android.singleton.b.a.getString(R.string.wm_page_kingkong_scheme_prefix)));
            add(new NavigateItem(100321, 9315, "https://p1.meituan.net/travelcube/730c029467d4b696a54e4747d4f441d612321.png", "日韩料理", f + com.meituan.android.singleton.b.a.getString(R.string.wm_page_kingkong_scheme_prefix)));
            add(new NavigateItem(101996, 9291, "https://p0.meituan.net/travelcube/ab0295e8dd87bac207f2c50e037b150513634.png", "面包蛋糕", f + com.meituan.android.singleton.b.a.getString(R.string.wm_page_kingkong_scheme_prefix)));
            add(new NavigateItem(100209, 9229, "https://p0.meituan.net/travelcube/4466ea2f3a7da8914bdaac034ee9c5c113778.png", "家常菜", f + com.meituan.android.singleton.b.a.getString(R.string.wm_page_kingkong_scheme_prefix)));
        }
    };

    public static List<NavigateItem> a() {
        return b;
    }

    public static ArrayList<String> a(String str) {
        String[] split;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "60ffc4755295fd26f8d34f988d875011", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "60ffc4755295fd26f8d34f988d875011");
        }
        if (TextUtils.isEmpty(str) || (split = str.split(CommonConstant.Symbol.COMMA)) == null) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str2 : split) {
            try {
                arrayList.add(str2);
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.e("getPoiMultiFilterCodes", e.getLocalizedMessage(), new Object[0]);
            }
        }
        return arrayList;
    }

    public static String a(ArrayList<String> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f2b8eaf54c942147f777b87dfcec38e1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f2b8eaf54c942147f777b87dfcec38e1");
        }
        StringBuilder sb = new StringBuilder();
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                sb.append(arrayList.get(i));
                if (i != size - 1) {
                    sb.append(CommonConstant.Symbol.COMMA);
                }
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x016f, code lost:
        if (r2 == false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(java.util.List<com.sankuai.waimai.business.page.home.model.NavigateItem> r22, int r23) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.page.home.helper.f.a(java.util.List, int):boolean");
    }
}
