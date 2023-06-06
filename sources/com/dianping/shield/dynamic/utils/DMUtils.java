package com.dianping.shield.dynamic.utils;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import com.dianping.agentsdk.agent.HoloAgent;
import com.dianping.agentsdk.framework.aq;
import com.dianping.agentsdk.framework.l;
import com.dianping.eunomia.c;
import com.dianping.mainboard.a;
import com.dianping.shield.bridge.ShieldLogger;
import com.dianping.shield.dynamic.model.extra.ColorUnionType;
import com.dianping.shield.dynamic.model.vc.ModuleKeyUnionType;
import com.dianping.shield.dynamic.objects.DynamicModuleViewItemData;
import com.dianping.shield.dynamic.utils.DMConstant;
import com.dianping.shield.entity.IndexPath;
import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.entity.ViewExtraInfo;
import com.dianping.shield.env.ShieldEnvironment;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.voyager.fragment.CommonShieldFragment;
import com.google.gson.Gson;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DMUtils {
    private static final int APPID_DP = 0;
    private static final int APPID_MT = 1;
    public static final int COLOR_INVALID = Integer.MAX_VALUE;
    private static final int LOADING_STATUS_DONE = 0;
    private static final int LOADING_STATUS_FAIL = 2;
    private static final int LOADING_STATUS_LOADING = 1;
    public static final String MGE_INFO_CUSTOM = "custom";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static l.b changeLoadingStatus(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2885fce82d286efbc975d3fc34213798", RobustBitConfig.DEFAULT_VALUE)) {
            return (l.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2885fce82d286efbc975d3fc34213798");
        }
        switch (i) {
            case 0:
                return l.b.DONE;
            case 1:
                return l.b.LOADING;
            case 2:
                return l.b.FAILED;
            default:
                return l.b.UNKNOWN;
        }
    }

    public static l.a changeLoadingMoreStatus(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4d6e583ae63d9e5f72a0e8c51735f122", RobustBitConfig.DEFAULT_VALUE)) {
            return (l.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4d6e583ae63d9e5f72a0e8c51735f122");
        }
        switch (i) {
            case 0:
                return l.a.DONE;
            case 1:
                return l.a.LOADING;
            case 2:
                return l.a.FAILED;
            default:
                return l.a.UNKNOWN;
        }
    }

    public static boolean isMT() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e158d37450de8381777fff5f1bfaaa0b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e158d37450de8381777fff5f1bfaaa0b")).booleanValue() : a.b().i == 1;
    }

    public static boolean isDP() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9b3b78bdeb9f313e27a4cfe0cc32726b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9b3b78bdeb9f313e27a4cfe0cc32726b")).booleanValue() : a.b().i == 0;
    }

    public static int parseColor(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "04988b7f90956b44a06d69c14e4d65b0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "04988b7f90956b44a06d69c14e4d65b0")).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return Integer.MAX_VALUE;
        }
        if (!str.startsWith("#")) {
            str = "#" + str;
        }
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return Integer.MAX_VALUE;
        }
    }

    public static ColorDrawable parseColorDrawable(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f130bffd456af0249c0f3098106d26ce", RobustBitConfig.DEFAULT_VALUE)) {
            return (ColorDrawable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f130bffd456af0249c0f3098106d26ce");
        }
        int parseColor = parseColor(str);
        if (parseColor == Integer.MAX_VALUE) {
            return null;
        }
        try {
            return new ColorDrawable(parseColor);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Drawable getHeaderFooterBackgroundColor(ColorUnionType colorUnionType) {
        Object[] objArr = {colorUnionType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "89ea31c715fc535132d22a00ff7ceafa", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "89ea31c715fc535132d22a00ff7ceafa");
        }
        if (colorUnionType != null) {
            if (colorUnionType instanceof ColorUnionType.StringColor) {
                int parseColor = parseColor(((ColorUnionType.StringColor) colorUnionType).getColor());
                if (parseColor != Integer.MAX_VALUE) {
                    return new ColorDrawable(parseColor);
                }
            } else if (colorUnionType instanceof ColorUnionType.GradientColorInfo) {
                return createGradientDrawable((ColorUnionType.GradientColorInfo) colorUnionType);
            }
        }
        return null;
    }

    public static GradientDrawable createGradientDrawable(ColorUnionType.GradientColorInfo gradientColorInfo) {
        Object[] objArr = {gradientColorInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f97df39e315d3909a709a3220fd30385", RobustBitConfig.DEFAULT_VALUE)) {
            return (GradientDrawable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f97df39e315d3909a709a3220fd30385");
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (gradientColorInfo != null) {
            int parseColor = parseColor(gradientColorInfo.getStartColor());
            int parseColor2 = parseColor(gradientColorInfo.getEndColor());
            int intValue = gradientColorInfo.getOrientation() != null ? gradientColorInfo.getOrientation().intValue() : GradientDrawable.Orientation.LEFT_RIGHT.ordinal();
            if (parseColor != Integer.MAX_VALUE && parseColor2 != Integer.MAX_VALUE) {
                gradientDrawable.setColors(new int[]{parseColor, parseColor2});
                gradientDrawable.setOrientation(GradientDrawable.Orientation.values()[intValue]);
                return gradientDrawable;
            }
        }
        gradientDrawable.setColor(0);
        return gradientDrawable;
    }

    public static List<String> changeJsonArrayToList(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2f157e3ca4b12922548ad530cd0d2e80", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2f157e3ca4b12922548ad530cd0d2e80");
        }
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null || jSONArray.length() == 0) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.optString(i));
        }
        return arrayList;
    }

    public static List<ArrayList<String>> modules2Strings(List<ArrayList<c>> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3fe37e41124a31c2fc9c35c669463df7", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3fe37e41124a31c2fc9c35c669463df7");
        }
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (int i = 0; i < list.size(); i++) {
            ArrayList<c> arrayList2 = list.get(i);
            if (arrayList2 != null) {
                ArrayList arrayList3 = new ArrayList();
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    arrayList3.add(arrayList2.get(i2).a);
                }
                arrayList.add(arrayList3);
            }
        }
        return arrayList;
    }

    public static List<ArrayList<c>> getModuleConfigItems(List<List<ModuleKeyUnionType>> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c2cd493dd23d25222a8a783ba67b1839", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c2cd493dd23d25222a8a783ba67b1839");
        }
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (List<ModuleKeyUnionType> list2 : list) {
            if (list2 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (ModuleKeyUnionType moduleKeyUnionType : list2) {
                    if (moduleKeyUnionType != null) {
                        c cVar = new c();
                        if (moduleKeyUnionType instanceof ModuleKeyUnionType.StructKey) {
                            ModuleKeyUnionType.StructKey structKey = (ModuleKeyUnionType.StructKey) moduleKeyUnionType;
                            cVar.a = structKey.getN();
                            if (structKey.getPriority() != null) {
                                cVar.d = structKey.getPriority().intValue();
                            }
                        } else if (moduleKeyUnionType instanceof ModuleKeyUnionType.StringKey) {
                            cVar.a = ((ModuleKeyUnionType.StringKey) moduleKeyUnionType).getKey();
                        } else if (moduleKeyUnionType instanceof ModuleKeyUnionType.StringKeyCallback) {
                            cVar.a = ((ModuleKeyUnionType.StringKeyCallback) moduleKeyUnionType).getKey();
                        }
                        arrayList2.add(cVar);
                    }
                }
                arrayList.add(arrayList2);
            }
        }
        return arrayList;
    }

    @Deprecated
    public static Map<String, Object> getMgeInfoLab(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "80476460b1ca0d7a6abd344407850521", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "80476460b1ca0d7a6abd344407850521");
        }
        if (jSONObject != null) {
            return getLabMap(jSONObject.optJSONObject("labs"));
        }
        return null;
    }

    public static Map<String, Object> getLabMap(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Map<String, Object> map = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b24b75304269c801574bff56def6e312", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b24b75304269c801574bff56def6e312");
        }
        if (jSONObject != null) {
            try {
                jSONObject = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("custom");
            jSONObject.remove("custom");
            try {
                map = (Map) new Gson().fromJson(jSONObject.toString(), (Class<Object>) Map.class);
            } catch (Exception e) {
                ShieldLogger shieldLogger = ShieldEnvironment.INSTANCE.getShieldLogger();
                shieldLogger.codeLogError(DMUtils.class, "custom:" + jSONObject.toString() + "  exception:" + e.toString(), "moduleStatistics");
            }
            if (optJSONObject != null) {
                map.put("custom", optJSONObject);
            }
        }
        return map;
    }

    public static String getModuleKeyByHostName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "95a9d24d978278cc3a61d01887c78250", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "95a9d24d978278cc3a61d01887c78250");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.lastIndexOf(64) != -1) {
            return str.substring(str.lastIndexOf(64) + 1, str.length());
        }
        return str.lastIndexOf(124) != -1 ? str.substring(str.lastIndexOf(124) + 1, str.length()) : str;
    }

    public static String getModuleKeyByHoloAgent(HoloAgent holoAgent) {
        Object[] objArr = {holoAgent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c327310fec1fa9a9a16567c32be4bcd9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c327310fec1fa9a9a16567c32be4bcd9") : getModuleKeyByHostName(holoAgent.getHostName());
    }

    public static boolean isSomeStringNotNullAndBlank(String... strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3894103e98ae30b76fcef562951eb8b8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3894103e98ae30b76fcef562951eb8b8")).booleanValue();
        }
        for (String str : strArr) {
            if (str != null && !str.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static Object strToEventParams(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a3f7b9bffedf2e3a55bb6571ad27a990", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a3f7b9bffedf2e3a55bb6571ad27a990");
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                return new JSONObject(str);
            }
            return new JSONObject();
        } catch (Exception unused) {
            return str;
        }
    }

    public static int dip2pxCut(Context context, float f) {
        Object[] objArr = {context, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e2a6fedcb61bb5a41f6603ece0d99faa", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e2a6fedcb61bb5a41f6603ece0d99faa")).intValue() : context == null ? (int) f : (int) (f * context.getResources().getDisplayMetrics().density);
    }

    public static int px2dipCut(Context context, float f) {
        Object[] objArr = {context, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "272242332c3e26875e8589ee897a6df0", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "272242332c3e26875e8589ee897a6df0")).intValue() : context == null ? (int) f : (int) (f / context.getResources().getDisplayMetrics().density);
    }

    public static Context getHostContext(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a56a4fed6551d04d1c41926e4fa3a475", RobustBitConfig.DEFAULT_VALUE)) {
            return (Context) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a56a4fed6551d04d1c41926e4fa3a475");
        }
        if (obj instanceof HoloAgent) {
            return ((HoloAgent) obj).getContext();
        }
        if (obj instanceof CommonShieldFragment) {
            return ((CommonShieldFragment) obj).getContext();
        }
        return null;
    }

    public static String getModuleName(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f65ae4d49bdfbd5b9ac5e56d0369c86e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f65ae4d49bdfbd5b9ac5e56d0369c86e") : obj instanceof HoloAgent ? ((HoloAgent) obj).getHostName() : "";
    }

    public static int getTitleBarHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "32a4e4851ea85d204e29bd419bbeff1b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "32a4e4851ea85d204e29bd419bbeff1b")).intValue() : isDP() ? 50 : 48;
    }

    public static boolean isPad(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "97d6fcbc3ea947ab521481f2446cf759", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "97d6fcbc3ea947ab521481f2446cf759")).booleanValue() : (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    public static DMConstant.ModuleOnAppearType getAppearTypeByScrollDirection(ScrollDirection scrollDirection) {
        Object[] objArr = {scrollDirection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1619cd38c8f62f3d62c4b0b75a914e21", RobustBitConfig.DEFAULT_VALUE)) {
            return (DMConstant.ModuleOnAppearType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1619cd38c8f62f3d62c4b0b75a914e21");
        }
        if (ScrollDirection.DOWN == scrollDirection) {
            return DMConstant.ModuleOnAppearType.ScrollInFromTop;
        }
        if (ScrollDirection.UP == scrollDirection) {
            return DMConstant.ModuleOnAppearType.ScrollInFromBottom;
        }
        if (ScrollDirection.PAGE_BACK == scrollDirection) {
            return DMConstant.ModuleOnAppearType.PageBack;
        }
        if (ScrollDirection.BECOME_ACTIVE == scrollDirection) {
            return DMConstant.ModuleOnAppearType.BecomeActive;
        }
        if (ScrollDirection.LEFT == scrollDirection) {
            return DMConstant.ModuleOnAppearType.ScrollInFromRight;
        }
        if (ScrollDirection.RIGHT == scrollDirection) {
            return DMConstant.ModuleOnAppearType.ScrollInFromLeft;
        }
        return DMConstant.ModuleOnAppearType.Appear;
    }

    public static DMConstant.ModuleOnDisappearType getDisappearTypeByScrollDirection(ScrollDirection scrollDirection) {
        Object[] objArr = {scrollDirection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "40a91021f7872d2689b09b4afbc0f9c4", RobustBitConfig.DEFAULT_VALUE)) {
            return (DMConstant.ModuleOnDisappearType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "40a91021f7872d2689b09b4afbc0f9c4");
        }
        if (ScrollDirection.UP == scrollDirection) {
            return DMConstant.ModuleOnDisappearType.ScrollOutFromTop;
        }
        if (ScrollDirection.DOWN == scrollDirection) {
            return DMConstant.ModuleOnDisappearType.ScrollOutFromBottom;
        }
        if (ScrollDirection.GO_AHEAD == scrollDirection) {
            return DMConstant.ModuleOnDisappearType.Goahead;
        }
        if (ScrollDirection.GO_BACK == scrollDirection) {
            return DMConstant.ModuleOnDisappearType.Goback;
        }
        if (ScrollDirection.RESIGN_ACTIVE == scrollDirection) {
            return DMConstant.ModuleOnDisappearType.ResignActive;
        }
        if (ScrollDirection.LEFT == scrollDirection) {
            return DMConstant.ModuleOnDisappearType.ScrollOutFromLeft;
        }
        if (ScrollDirection.RIGHT == scrollDirection) {
            return DMConstant.ModuleOnDisappearType.ScrollOutFromRight;
        }
        return DMConstant.ModuleOnDisappearType.Disappear;
    }

    @Deprecated
    public static JSONObject generateCallbackJson(@Nullable DynamicModuleViewItemData dynamicModuleViewItemData, @Nullable NodePath nodePath) {
        JSONObject jSONObject;
        int i;
        Object[] objArr = {dynamicModuleViewItemData, nodePath};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d68feaef81de0a59eeaa59cc963e2bd7", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d68feaef81de0a59eeaa59cc963e2bd7");
        }
        JSONObject jSONObject2 = new JSONObject();
        if (dynamicModuleViewItemData != null) {
            jSONObject = dynamicModuleViewItemData.jsContextInject != null ? dynamicModuleViewItemData.jsContextInject : new JSONObject();
        } else {
            jSONObject = new JSONObject();
        }
        if (dynamicModuleViewItemData != null) {
            try {
                i = dynamicModuleViewItemData.index;
            } catch (JSONException unused) {
            }
        } else {
            i = -1;
        }
        jSONObject2.put("index", i);
        jSONObject2.put("row", nodePath != null ? nodePath.row : -1);
        jSONObject2.put("section", nodePath != null ? nodePath.section : -1);
        jSONObject2.put("data", (dynamicModuleViewItemData == null || dynamicModuleViewItemData.jsonData == null) ? new JSONObject() : new JSONObject(dynamicModuleViewItemData.jsonData));
        jSONObject2.put("context", jSONObject);
        return jSONObject2;
    }

    @Deprecated
    public static JSONObject generateCallbackJson(@Nullable DynamicModuleViewItemData dynamicModuleViewItemData, @Nullable NodePath nodePath, Context context, @Nullable ViewExtraInfo viewExtraInfo) {
        Object[] objArr = {dynamicModuleViewItemData, nodePath, context, viewExtraInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0cbc63631dbceffe77d8446d634fa70c", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0cbc63631dbceffe77d8446d634fa70c");
        }
        JSONObject generateCallbackJson = generateCallbackJson(dynamicModuleViewItemData, nodePath);
        if (generateCallbackJson != null && viewExtraInfo != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("row", -1);
                jSONObject.put("column", viewExtraInfo.spanIndex);
                jSONObject.put("width", aq.b(context, viewExtraInfo.width));
                jSONObject.put("height", aq.b(context, viewExtraInfo.height));
                generateCallbackJson.put("extraInfo", jSONObject);
            } catch (JSONException unused) {
            }
        }
        return generateCallbackJson;
    }

    public static JSONObject calExposeCallbackJson(@Nullable DynamicModuleViewItemData dynamicModuleViewItemData, @Nullable NodePath nodePath, Context context, @Nullable ViewExtraInfo viewExtraInfo) {
        JSONObject jSONObject;
        Object[] objArr = {dynamicModuleViewItemData, nodePath, context, viewExtraInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7948f54a2694cab32586cc6b40400c4b", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7948f54a2694cab32586cc6b40400c4b");
        }
        IndexPath indexPath = getIndexPath(nodePath);
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (dynamicModuleViewItemData != null) {
                jSONObject = dynamicModuleViewItemData.jsContextInject != null ? dynamicModuleViewItemData.jsContextInject : new JSONObject();
            } else {
                jSONObject = new JSONObject();
            }
            jSONObject2.put("index", indexPath.index);
            jSONObject2.put("row", indexPath.row);
            jSONObject2.put("section", indexPath.section);
            jSONObject2.put("data", (dynamicModuleViewItemData == null || dynamicModuleViewItemData.newViewInfo == null || dynamicModuleViewItemData.jsonData == null) ? new JSONObject() : new JSONObject(dynamicModuleViewItemData.jsonData));
            jSONObject2.put("context", jSONObject);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("row", -1);
            if (viewExtraInfo != null) {
                jSONObject3.put("column", viewExtraInfo.spanIndex);
                jSONObject3.put("width", aq.b(context, viewExtraInfo.width));
                jSONObject3.put("height", aq.b(context, viewExtraInfo.height));
            }
            jSONObject2.put("extraInfo", jSONObject3);
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    public static JSONObject calAppearCallbackJson(@Nullable DynamicModuleViewItemData dynamicModuleViewItemData, @Nullable NodePath nodePath, ScrollDirection scrollDirection, HashMap<String, Long> hashMap) {
        Object[] objArr = {dynamicModuleViewItemData, nodePath, scrollDirection, hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cd6e23ed48b4d0f9e0532411479e4e71", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cd6e23ed48b4d0f9e0532411479e4e71");
        }
        long currentTimeMillis = System.currentTimeMillis();
        IndexPath indexPath = getIndexPath(nodePath);
        hashMap.put(indexPath.section + CommonConstant.Symbol.UNDERLINE + indexPath.row + CommonConstant.Symbol.UNDERLINE + indexPath.index, Long.valueOf(currentTimeMillis));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("index", indexPath.index);
            jSONObject.put("row", indexPath.row);
            jSONObject.put("section", indexPath.section);
            jSONObject.put("data", (dynamicModuleViewItemData == null || dynamicModuleViewItemData.newViewInfo == null || dynamicModuleViewItemData.jsonData == null) ? new JSONObject() : new JSONObject(dynamicModuleViewItemData.jsonData));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", getAppearTypeByScrollDirection(scrollDirection).ordinal());
            jSONObject2.put(DeviceInfo.TM, currentTimeMillis);
            jSONObject.put("extraInfo", jSONObject2);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static JSONObject calDisappearCallbackJson(@Nullable DynamicModuleViewItemData dynamicModuleViewItemData, @Nullable NodePath nodePath, ScrollDirection scrollDirection, HashMap<String, Long> hashMap) {
        Object[] objArr = {dynamicModuleViewItemData, nodePath, scrollDirection, hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "84d30e47f439e18e4f90c30d5c5c379a", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "84d30e47f439e18e4f90c30d5c5c379a");
        }
        IndexPath indexPath = getIndexPath(nodePath);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("index", indexPath.index);
            jSONObject.put("row", indexPath.row);
            jSONObject.put("section", indexPath.section);
            jSONObject.put("data", (dynamicModuleViewItemData == null || dynamicModuleViewItemData.newViewInfo == null || dynamicModuleViewItemData.jsonData == null) ? new JSONObject() : new JSONObject(dynamicModuleViewItemData.jsonData));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", getDisappearTypeByScrollDirection(scrollDirection).ordinal());
            Long l = hashMap.get(indexPath.section + CommonConstant.Symbol.UNDERLINE + indexPath.row + CommonConstant.Symbol.UNDERLINE + indexPath.index);
            if (l != null) {
                long currentTimeMillis = System.currentTimeMillis();
                jSONObject2.put("duration", currentTimeMillis - l.longValue());
                jSONObject2.put(DeviceInfo.TM, currentTimeMillis);
            }
            jSONObject.put("extraInfo", jSONObject2);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static IndexPath getIndexPath(@Nullable NodePath nodePath) {
        Object[] objArr = {nodePath};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "11ee541244be0d44c3df4864816faaa2", RobustBitConfig.DEFAULT_VALUE)) {
            return (IndexPath) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "11ee541244be0d44c3df4864816faaa2");
        }
        IndexPath indexPath = new IndexPath();
        if (nodePath == null || nodePath.indexPath == null) {
            return indexPath;
        }
        indexPath.section = nodePath.indexPath.section;
        indexPath.row = nodePath.indexPath.row;
        indexPath.index = nodePath.indexPath.index;
        return indexPath;
    }
}
