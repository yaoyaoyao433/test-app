package com.sankuai.waimai.business.page.common.util;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.api.RecommendedSearchKeyword;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
import com.sankuai.waimai.platform.encrypt.Env;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static Map<String, Object> a(RecommendedSearchKeyword recommendedSearchKeyword, String str) {
        Object[] objArr = {recommendedSearchKeyword, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e706b93d8b2643a7308ecb630de8fa26", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e706b93d8b2643a7308ecb630de8fa26");
        }
        HashMap hashMap = new HashMap();
        if (recommendedSearchKeyword != null) {
            if (recommendedSearchKeyword.viewKeyword != null && str != null && str.contains(recommendedSearchKeyword.viewKeyword)) {
                hashMap.put("has_word", "1");
            } else {
                hashMap.put("has_word", "0");
            }
            hashMap.put("is_travel", TextUtils.isEmpty(recommendedSearchKeyword.sceneType) ? "" : recommendedSearchKeyword.sceneType);
            hashMap.put("default_stid", TextUtils.isEmpty(recommendedSearchKeyword.tgt_stids) ? "" : recommendedSearchKeyword.tgt_stids);
            hashMap.put("keyword", TextUtils.isEmpty(recommendedSearchKeyword.searchKeyword) ? "" : recommendedSearchKeyword.searchKeyword);
            hashMap.put("label_word", TextUtils.isEmpty(recommendedSearchKeyword.viewKeyword) ? "" : recommendedSearchKeyword.viewKeyword);
            hashMap.put("word_type", Integer.valueOf(recommendedSearchKeyword.wordType));
            try {
                hashMap.putAll(com.sankuai.waimai.mach.utils.b.a(recommendedSearchKeyword.logData));
            } catch (Exception unused) {
            }
        } else {
            hashMap.put("has_word", "0");
            hashMap.put("word_type", 0);
            hashMap.put("is_travel", "");
            hashMap.put("default_stid", "");
            hashMap.put("keyword", "");
            hashMap.put("label_word", "");
        }
        return hashMap;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.page.common.util.a$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] a = new int[Env.EnvType.valuesCustom().length];

        static {
            try {
                a[Env.EnvType.TEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Env.EnvType.STAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static void a(Poi poi, ArrayList<Integer> arrayList, boolean z, boolean z2, boolean z3) {
        Object[] objArr = {poi, arrayList, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5c430de99d5e8f0a7f084a527d450ec2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5c430de99d5e8f0a7f084a527d450ec2");
        } else if (poi == null) {
        } else {
            poi.formatPoiScore();
            ArrayList<Poi.LabelInfoListItem> labelInfoList = poi.getLabelInfoList();
            if (com.sankuai.waimai.foundation.utils.b.a(labelInfoList)) {
                Iterator<Poi.LabelInfoListItem> it = labelInfoList.iterator();
                while (it.hasNext()) {
                    Poi.LabelInfoListItem next = it.next();
                    if (next != null) {
                        next.parseColor();
                    }
                }
            }
            poi.boldingList = arrayList;
            Object[] objArr2 = {poi};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.page.common.mananger.a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "81d34021491707918bac73b7fbf062f4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "81d34021491707918bac73b7fbf062f4");
            } else if (poi != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (!TextUtils.isEmpty(poi.mtDeliveryTime)) {
                    spannableStringBuilder.append((CharSequence) poi.mtDeliveryTime);
                    if (poi.isTextBold(2)) {
                        spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 33);
                    }
                }
                if (!TextUtils.isEmpty(poi.distance)) {
                    spannableStringBuilder.append((CharSequence) "  ");
                    spannableStringBuilder.append((CharSequence) poi.distance);
                    if (poi.isTextBold(5)) {
                        spannableStringBuilder.setSpan(new StyleSpan(1), spannableStringBuilder.length() - poi.distance.length(), spannableStringBuilder.length(), 33);
                    }
                }
                poi.distanceAndTime = spannableStringBuilder;
            }
            if (z) {
                Object[] objArr3 = {poi, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.common.mananger.a.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "1cd695269338d922665ad8800f584ddc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "1cd695269338d922665ad8800f584ddc");
                } else if (poi != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    if (z2) {
                        if (!TextUtils.isEmpty(poi.averagePriceTip)) {
                            spannableStringBuilder2.append((CharSequence) poi.averagePriceTip);
                            if (poi.isTextBold(7)) {
                                spannableStringBuilder2.setSpan(new StyleSpan(1), spannableStringBuilder2.length() - poi.averagePriceTip.length(), spannableStringBuilder2.length(), 33);
                            }
                            spannableStringBuilder2.append((CharSequence) "  ");
                        }
                    } else if (!TextUtils.isEmpty(poi.minPriceTip)) {
                        spannableStringBuilder2.append((CharSequence) poi.minPriceTip);
                        if (poi.isTextBold(4)) {
                            spannableStringBuilder2.setSpan(new StyleSpan(1), 0, spannableStringBuilder2.length(), 33);
                        }
                        spannableStringBuilder2.append((CharSequence) "  ");
                    }
                    poi.priceAndShipping = com.sankuai.waimai.business.page.common.mananger.a.a(poi, spannableStringBuilder2, z3);
                }
            } else {
                Object[] objArr4 = {poi, Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.page.common.mananger.a.a;
                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "be19acb5114b0aa88adf019c5c9b19f7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "be19acb5114b0aa88adf019c5c9b19f7");
                } else if (poi != null) {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                    if (!TextUtils.isEmpty(poi.minPriceTip)) {
                        spannableStringBuilder3.append((CharSequence) poi.minPriceTip);
                        if (poi.isTextBold(4)) {
                            spannableStringBuilder3.setSpan(new StyleSpan(1), 0, spannableStringBuilder3.length(), 33);
                        }
                        spannableStringBuilder3.append((CharSequence) "  ");
                    }
                    com.sankuai.waimai.business.page.common.mananger.a.a(poi, spannableStringBuilder3, z3);
                    if (!TextUtils.isEmpty(poi.averagePriceTip)) {
                        spannableStringBuilder3.append((CharSequence) poi.averagePriceTip);
                        if (poi.isTextBold(7)) {
                            spannableStringBuilder3.setSpan(new StyleSpan(1), spannableStringBuilder3.length() - poi.averagePriceTip.length(), spannableStringBuilder3.length(), 33);
                        }
                        spannableStringBuilder3.append((CharSequence) "  ");
                    }
                    poi.priceAndShipping = spannableStringBuilder3;
                }
            }
            Object[] objArr5 = {poi};
            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.business.page.common.mananger.a.a;
            if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "0b4070098cc1e8fcc3b35756678c35e0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "0b4070098cc1e8fcc3b35756678c35e0");
            } else if (poi != null) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                if (!TextUtils.isEmpty(poi.monthSalesTip)) {
                    spannableStringBuilder4.append((CharSequence) poi.monthSalesTip);
                    if (poi.isTextBold(1)) {
                        spannableStringBuilder4.setSpan(new StyleSpan(1), 0, spannableStringBuilder4.length(), 33);
                    }
                }
                if (poi.isOnlySelfDelivery == 1 && !TextUtils.isEmpty(poi.averagePriceTip)) {
                    spannableStringBuilder4.append((CharSequence) "  ");
                    spannableStringBuilder4.append((CharSequence) poi.averagePriceTip);
                    if (poi.isTextBold(7)) {
                        spannableStringBuilder4.setSpan(new StyleSpan(1), spannableStringBuilder4.length() - poi.averagePriceTip.length(), spannableStringBuilder4.length(), 33);
                    }
                }
                poi.monthSales = spannableStringBuilder4;
            }
        }
    }
}
