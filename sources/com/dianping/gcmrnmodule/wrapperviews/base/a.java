package com.dianping.gcmrnmodule.wrapperviews.base;

import com.dianping.gcmrnmodule.objects.d;
import com.dianping.shield.dynamic.model.extra.ColorUnionType;
import com.dianping.shield.dynamic.model.extra.MGEInfo;
import com.dianping.shield.dynamic.model.extra.MPTInfo;
import com.dianping.shield.dynamic.model.extra.MarginInfo;
import com.dianping.shield.dynamic.model.extra.MidasInfo;
import com.dianping.shield.dynamic.model.vc.CardStyle;
import com.dianping.shield.dynamic.model.vc.DragRefreshInfo;
import com.dianping.shield.dynamic.model.vc.ModuleKeyUnionType;
import com.dianping.shield.dynamic.model.vc.ModulesVCSettingInfo;
import com.dianping.shield.dynamic.model.vc.SeparatorLineInfo;
import com.dianping.shield.dynamic.model.vc.TitleBarInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeArray;
import com.facebook.react.bridge.ReadableType;
import com.meituan.android.recce.props.gens.MarginLeft;
import com.meituan.android.recce.props.gens.MarginRight;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.k;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0000\u001a\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\bH\u0000¢\u0006\u0002\u0010\t\u001a\f\u0010\n\u001a\u00020\u000b*\u00020\u0002H\u0000\u001a\f\u0010\f\u001a\u00020\r*\u00020\u0002H\u0000\u001a\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0002H\u0000\u001a\f\u0010\u0010\u001a\u00020\u0007*\u00020\u0011H\u0000\u001a\f\u0010\u0012\u001a\u00020\u0013*\u00020\u0002H\u0000\u001a\f\u0010\u0014\u001a\u00020\u0015*\u00020\u0002H\u0000\u001a\f\u0010\u0016\u001a\u00020\u0017*\u00020\u0002H\u0000\u001a\f\u0010\u0018\u001a\u00020\u0019*\u00020\u0002H\u0000\u001a\f\u0010\u001a\u001a\u00020\u001b*\u00020\u0002H\u0000\u001a\f\u0010\u001c\u001a\u00020\u001d*\u00020\bH\u0000\u001a\f\u0010\u001e\u001a\u00020\u001f*\u00020\u0002H\u0000\u001a\u0014\u0010 \u001a\u00020!*\u00020\u00022\u0006\u0010\"\u001a\u00020\u0011H\u0000\u001a\u000e\u0010#\u001a\u0004\u0018\u00010$*\u00020%H\u0000\u001a\f\u0010&\u001a\u00020'*\u00020\u0002H\u0000\u001a\u001c\u0010(\u001a\u0012\u0012\u0004\u0012\u00020*0)j\b\u0012\u0004\u0012\u00020*`+*\u00020\bH\u0000\u001a(\u0010(\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020*0,j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020*`-*\u00020\u0002H\u0000\u001a\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020/H\u0000¢\u0006\u0002\u00100\u001a\u0018\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070,*\u00020\u0002H\u0000\u001a\f\u00102\u001a\u000203*\u00020\u0002H\u0000¨\u00064"}, d2 = {"toActionsConfiguration", "Lcom/dianping/shield/dynamic/model/extra/ActionsConfigurationInfo;", "Lcom/facebook/react/bridge/ReadableMap;", "toCardStyle", "Lcom/dianping/shield/dynamic/model/vc/CardStyle;", "toConfigKeys", "", "", "Lcom/facebook/react/bridge/ReadableArray;", "(Lcom/facebook/react/bridge/ReadableArray;)[Ljava/lang/String;", "toDragRefreshInfo", "Lcom/dianping/shield/dynamic/model/vc/DragRefreshInfo;", "toGirdItemInfo", "Lcom/dianping/shield/dynamic/model/view/GridItemInfo;", "toGradientColor", "Lcom/dianping/shield/dynamic/model/extra/ColorUnionType$GradientColorInfo;", "toHexString", "", "toIndexPath", "Lcom/dianping/shield/entity/IndexPath;", "toMGEInfo", "Lcom/dianping/shield/dynamic/model/extra/MGEInfo;", "toMPTInfo", "Lcom/dianping/shield/dynamic/model/extra/MPTInfo;", "toMarginInfo", "Lcom/dianping/shield/dynamic/model/extra/MarginInfo;", "toMidasInfo", "Lcom/dianping/shield/dynamic/model/extra/MidasInfo;", "toModuleKeys", "Lcom/dianping/gcmrnmodule/objects/ModuleKeys;", "toModulesVCSettingInfo", "Lcom/dianping/shield/dynamic/model/vc/ModulesVCSettingInfo;", "toScrollEvent", "Lcom/dianping/shield/dynamic/model/extra/ScrollEvent;", "viewId", "toSectionBackgroundColor", "Lcom/dianping/shield/dynamic/model/extra/ColorUnionType;", "Lcom/facebook/react/bridge/Dynamic;", "toSeparatorLineInfo", "Lcom/dianping/shield/dynamic/model/vc/SeparatorLineInfo;", "toSerializableHashMap", "Ljava/util/ArrayList;", "Ljava/io/Serializable;", "Lkotlin/collections/ArrayList;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "toStringArray", "Lcom/facebook/react/bridge/ReadableNativeArray;", "(Lcom/facebook/react/bridge/ReadableNativeArray;)[Ljava/lang/String;", "toStringHashMap", "toTitleBarInfo", "Lcom/dianping/shield/dynamic/model/vc/TitleBarInfo;", "mrnmodule_release"}, k = 2, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;

    @NotNull
    public static final d a(@NotNull ReadableArray readableArray) {
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6662e23da2970ad7804b2391bc83e9ef", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6662e23da2970ad7804b2391bc83e9ef");
        }
        h.b(readableArray, "$this$toModuleKeys");
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList2 = new ArrayList();
            ReadableArray array = readableArray.getArray(i);
            if (array != null) {
                int size2 = array.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    arrayList2.add(new ModuleKeyUnionType.StringKey(array.getString(i2)));
                    String string = array.getString(i2);
                    if (string != null) {
                        h.a((Object) string, AdvanceSetting.NETWORK_TYPE);
                        hashMap.put(string, new k(Integer.valueOf(i), Integer.valueOf(i2)));
                    }
                }
            }
            arrayList.add(arrayList2);
        }
        return new d(arrayList, hashMap);
    }

    @NotNull
    public static final SeparatorLineInfo a(@NotNull ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "966904ab0d24c39250c78f4b0b36676d", RobustBitConfig.DEFAULT_VALUE)) {
            return (SeparatorLineInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "966904ab0d24c39250c78f4b0b36676d");
        }
        h.b(readableMap, "$this$toSeparatorLineInfo");
        SeparatorLineInfo separatorLineInfo = new SeparatorLineInfo();
        try {
            Iterator<Map.Entry<String, Object>> entryIterator = readableMap.getEntryIterator();
            h.a((Object) entryIterator, "this.entryIterator");
            while (entryIterator.hasNext()) {
                Map.Entry<String, Object> next = entryIterator.next();
                if (!h.a((Object) "topLineColor", (Object) next.getKey()) && !h.a((Object) "middleLineColor", (Object) next.getKey()) && !h.a((Object) "bottomLineColor", (Object) next.getKey())) {
                    if (h.a((Object) "leftSeparatorMargin", (Object) next.getKey()) || h.a((Object) "rightSeparatorMargin", (Object) next.getKey())) {
                        Object value = next.getValue();
                        if (!(value instanceof Double)) {
                            value = null;
                        }
                        Double d = (Double) value;
                        Integer valueOf = d != null ? Integer.valueOf((int) d.doubleValue()) : null;
                        String key = next.getKey();
                        if (key != null) {
                            int hashCode = key.hashCode();
                            if (hashCode != 1137626935) {
                                if (hashCode == 1548025324 && key.equals("leftSeparatorMargin")) {
                                    separatorLineInfo.setLeftSeparatorMargin(valueOf);
                                }
                            } else if (key.equals("rightSeparatorMargin")) {
                                separatorLineInfo.setRightSeparatorMargin(valueOf);
                            }
                        }
                    }
                }
                Object value2 = next.getValue();
                if (!(value2 instanceof Double)) {
                    value2 = null;
                }
                Double d2 = (Double) value2;
                String a2 = d2 != null ? a((int) d2.doubleValue()) : null;
                String key2 = next.getKey();
                if (key2 != null) {
                    int hashCode2 = key2.hashCode();
                    if (hashCode2 != -2108871196) {
                        if (hashCode2 != -157190662) {
                            if (hashCode2 == 1329833402 && key2.equals("middleLineColor")) {
                                separatorLineInfo.setMiddleLineColor(a2);
                            }
                        } else if (key2.equals("topLineColor")) {
                            separatorLineInfo.setTopLineColor(a2);
                        }
                    } else if (key2.equals("bottomLineColor")) {
                        separatorLineInfo.setBottomLineColor(a2);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return separatorLineInfo;
    }

    @NotNull
    public static final ModulesVCSettingInfo b(@NotNull ReadableMap readableMap) {
        String a2;
        String a3;
        String key;
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "42b804e38d644665083695b681a508f4", RobustBitConfig.DEFAULT_VALUE)) {
            return (ModulesVCSettingInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "42b804e38d644665083695b681a508f4");
        }
        h.b(readableMap, "$this$toModulesVCSettingInfo");
        ModulesVCSettingInfo modulesVCSettingInfo = new ModulesVCSettingInfo();
        try {
            Iterator<Map.Entry<String, Object>> entryIterator = readableMap.getEntryIterator();
            h.a((Object) entryIterator, "this.entryIterator");
            while (entryIterator.hasNext()) {
                Map.Entry<String, Object> next = entryIterator.next();
                if (h.a((Object) "extraInfo", (Object) next.getKey())) {
                    Object value = next.getValue();
                    if (!(value instanceof ReadableMap)) {
                        value = null;
                    }
                    ReadableMap readableMap2 = (ReadableMap) value;
                    modulesVCSettingInfo.setExtraInfo(readableMap2 != null ? l(readableMap2) : null);
                } else if (h.a((Object) "reserveUnUsedModule", (Object) next.getKey())) {
                    Object value2 = next.getValue();
                    if (!(value2 instanceof Boolean)) {
                        value2 = null;
                    }
                    modulesVCSettingInfo.setReserveUnUsedModule((Boolean) value2);
                } else {
                    if (!h.a((Object) DMKeys.KEY_SECTION_HEADER_BACKGROUND_COLOR, (Object) next.getKey()) && !h.a((Object) DMKeys.KEY_SECTION_FOOTER_BACKGROUND_COLOR, (Object) next.getKey())) {
                        Object value3 = next.getValue();
                        if (!(value3 instanceof Double)) {
                            value3 = null;
                        }
                        Double d = (Double) value3;
                        Integer valueOf = d != null ? Integer.valueOf((int) d.doubleValue()) : null;
                        String key2 = next.getKey();
                        if (key2 != null) {
                            switch (key2.hashCode()) {
                                case -1524500503:
                                    if (key2.equals("autoTopHoverOffset")) {
                                        modulesVCSettingInfo.setAutoTopHoverOffset(valueOf);
                                        break;
                                    } else {
                                        continue;
                                    }
                                case -1487379726:
                                    if (key2.equals(DMKeys.KEY_AUTO_EXPOSE_VIEW_TYPE)) {
                                        modulesVCSettingInfo.setAutoExposeViewType(valueOf);
                                        break;
                                    } else {
                                        continue;
                                    }
                                case -599904534:
                                    if (key2.equals("rightMargin")) {
                                        modulesVCSettingInfo.setRightMargin(valueOf);
                                        break;
                                    } else {
                                        continue;
                                    }
                                case -516560720:
                                    if (key2.equals("heightForExtraFirstSectionHeader")) {
                                        modulesVCSettingInfo.setHeightForExtraFirstSectionHeader(valueOf);
                                        break;
                                    } else {
                                        continue;
                                    }
                                case 219293081:
                                    if (key2.equals("sectionHeaderHeight")) {
                                        modulesVCSettingInfo.setSectionHeaderHeight(valueOf);
                                        break;
                                    } else {
                                        continue;
                                    }
                                case 865866876:
                                    if (key2.equals("heightForExtraLastSectionFooter")) {
                                        modulesVCSettingInfo.setHeightForExtraLastSectionFooter(valueOf);
                                        break;
                                    } else {
                                        continue;
                                    }
                                case 1194206804:
                                    if (key2.equals("linkType")) {
                                        modulesVCSettingInfo.setLinkType(valueOf);
                                        break;
                                    } else {
                                        continue;
                                    }
                                case 1860761127:
                                    if (key2.equals("sectionFooterHeight")) {
                                        modulesVCSettingInfo.setSectionFooterHeight(valueOf);
                                        break;
                                    } else {
                                        continue;
                                    }
                                case 1928835221:
                                    if (key2.equals("leftMargin")) {
                                        modulesVCSettingInfo.setLeftMargin(valueOf);
                                        break;
                                    } else {
                                        continue;
                                    }
                                default:
                                    continue;
                            }
                        }
                    }
                    if (next.getValue() instanceof Double) {
                        String key3 = next.getKey();
                        if (key3 != null) {
                            int hashCode = key3.hashCode();
                            if (hashCode != -1189526877) {
                                if (hashCode == 883503573 && key3.equals(DMKeys.KEY_SECTION_FOOTER_BACKGROUND_COLOR)) {
                                    Object value4 = next.getValue();
                                    if (!(value4 instanceof Double)) {
                                        value4 = null;
                                    }
                                    Double d2 = (Double) value4;
                                    modulesVCSettingInfo.setSectionFooterBackgroundColor((d2 == null || (a2 = a((int) d2.doubleValue())) == null) ? null : new ColorUnionType.StringColor(a2));
                                }
                            } else if (key3.equals(DMKeys.KEY_SECTION_HEADER_BACKGROUND_COLOR)) {
                                Object value5 = next.getValue();
                                if (!(value5 instanceof Double)) {
                                    value5 = null;
                                }
                                Double d3 = (Double) value5;
                                modulesVCSettingInfo.setSectionHeaderBackgroundColor((d3 == null || (a3 = a((int) d3.doubleValue())) == null) ? null : new ColorUnionType.StringColor(a3));
                            }
                        }
                    } else if ((next.getValue() instanceof ReadableMap) && (key = next.getKey()) != null) {
                        int hashCode2 = key.hashCode();
                        if (hashCode2 != -1189526877) {
                            if (hashCode2 == 883503573 && key.equals(DMKeys.KEY_SECTION_FOOTER_BACKGROUND_COLOR)) {
                                Object value6 = next.getValue();
                                if (!(value6 instanceof ReadableMap)) {
                                    value6 = null;
                                }
                                ReadableMap readableMap3 = (ReadableMap) value6;
                                modulesVCSettingInfo.setSectionFooterBackgroundColor(readableMap3 != null ? k(readableMap3) : null);
                            }
                        } else if (key.equals(DMKeys.KEY_SECTION_HEADER_BACKGROUND_COLOR)) {
                            Object value7 = next.getValue();
                            if (!(value7 instanceof ReadableMap)) {
                                value7 = null;
                            }
                            ReadableMap readableMap4 = (ReadableMap) value7;
                            modulesVCSettingInfo.setSectionHeaderBackgroundColor(readableMap4 != null ? k(readableMap4) : null);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return modulesVCSettingInfo;
    }

    @NotNull
    private static HashMap<String, Serializable> l(@NotNull ReadableMap readableMap) {
        Object value;
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f271dedd7d8db60b6105e24bacae9f5d", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f271dedd7d8db60b6105e24bacae9f5d");
        }
        h.b(readableMap, "$this$toSerializableHashMap");
        HashMap<String, Serializable> hashMap = new HashMap<>();
        try {
            Iterator<Map.Entry<String, Object>> entryIterator = readableMap.getEntryIterator();
            h.a((Object) entryIterator, "this.entryIterator");
            while (entryIterator.hasNext()) {
                Map.Entry<String, Object> next = entryIterator.next();
                if (next.getValue() != null) {
                    if (next.getValue() instanceof ReadableMap) {
                        HashMap<String, Serializable> hashMap2 = hashMap;
                        String key = next.getKey();
                        h.a((Object) key, "entry.key");
                        Object value2 = next.getValue();
                        if (value2 == null) {
                            throw new o("null cannot be cast to non-null type com.facebook.react.bridge.ReadableMap");
                        }
                        hashMap2.put(key, l((ReadableMap) value2));
                    } else if (next.getValue() instanceof ReadableArray) {
                        HashMap<String, Serializable> hashMap3 = hashMap;
                        String key2 = next.getKey();
                        h.a((Object) key2, "entry.key");
                        Object value3 = next.getValue();
                        if (value3 == null) {
                            throw new o("null cannot be cast to non-null type com.facebook.react.bridge.ReadableArray");
                        }
                        hashMap3.put(key2, b((ReadableArray) value3));
                    } else if (next.getValue() instanceof Double) {
                        Object value4 = next.getValue();
                        if (value4 == null) {
                            throw new o("null cannot be cast to non-null type kotlin.Double");
                        }
                        double doubleValue = ((Double) value4).doubleValue();
                        if (next.getValue() == null) {
                            throw new o("null cannot be cast to non-null type kotlin.Double");
                        }
                        if (doubleValue == ((int) ((Double) value).doubleValue())) {
                            HashMap<String, Serializable> hashMap4 = hashMap;
                            String key3 = next.getKey();
                            h.a((Object) key3, "entry.key");
                            Object value5 = next.getValue();
                            if (value5 == null) {
                                throw new o("null cannot be cast to non-null type kotlin.Double");
                            }
                            Integer valueOf = Integer.valueOf((int) ((Double) value5).doubleValue());
                            if (!(valueOf instanceof Serializable)) {
                                valueOf = null;
                            }
                            Integer num = valueOf;
                            if (num == null) {
                                num = (Serializable) 0;
                            }
                            hashMap4.put(key3, num);
                        } else {
                            HashMap<String, Serializable> hashMap5 = hashMap;
                            String key4 = next.getKey();
                            h.a((Object) key4, "entry.key");
                            Object value6 = next.getValue();
                            if (!(value6 instanceof Serializable)) {
                                value6 = null;
                            }
                            Serializable serializable = (Serializable) value6;
                            if (serializable == null) {
                                serializable = (Serializable) 0;
                            }
                            hashMap5.put(key4, serializable);
                        }
                    } else {
                        HashMap<String, Serializable> hashMap6 = hashMap;
                        String key5 = next.getKey();
                        h.a((Object) key5, "entry.key");
                        Object value7 = next.getValue();
                        if (value7 == null) {
                            throw new o("null cannot be cast to non-null type java.io.Serializable");
                        }
                        hashMap6.put(key5, (Serializable) value7);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hashMap;
    }

    @NotNull
    public static final ArrayList<Serializable> b(@NotNull ReadableArray readableArray) {
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4b3fbdf669cc03e2b07d6f4e3b5f0b52", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4b3fbdf669cc03e2b07d6f4e3b5f0b52");
        }
        h.b(readableArray, "$this$toSerializableHashMap");
        ArrayList<Serializable> arrayList = new ArrayList<>();
        try {
            int size = readableArray.size();
            for (int i = 0; i < size; i++) {
                if (!readableArray.isNull(i)) {
                    switch (b.a[readableArray.getType(i).ordinal()]) {
                        case 1:
                            ReadableMap map = readableArray.getMap(i);
                            if (map != null) {
                                HashMap<String, Serializable> l = l(map);
                                if (l != null) {
                                    arrayList.add(l);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        case 2:
                            ReadableArray array = readableArray.getArray(i);
                            if (array != null) {
                                ArrayList<Serializable> b = b(array);
                                if (b != null) {
                                    arrayList.add(b);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        case 3:
                            arrayList.add(Long.valueOf((long) readableArray.getDouble(i)));
                            continue;
                        default:
                            Dynamic dynamic = readableArray.getDynamic(i);
                            if (dynamic == null) {
                                throw new o("null cannot be cast to non-null type java.io.Serializable");
                            }
                            arrayList.add((Serializable) dynamic);
                            continue;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    @NotNull
    public static final DragRefreshInfo c(@NotNull ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "32bb74043a168e6fd8e3590d0b89fba5", RobustBitConfig.DEFAULT_VALUE)) {
            return (DragRefreshInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "32bb74043a168e6fd8e3590d0b89fba5");
        }
        h.b(readableMap, "$this$toDragRefreshInfo");
        DragRefreshInfo dragRefreshInfo = new DragRefreshInfo();
        try {
            Iterator<Map.Entry<String, Object>> entryIterator = readableMap.getEntryIterator();
            h.a((Object) entryIterator, "this.entryIterator");
            while (entryIterator.hasNext()) {
                Map.Entry<String, Object> next = entryIterator.next();
                String key = next.getKey();
                if (key != null) {
                    int hashCode = key.hashCode();
                    if (hashCode != -1988965363) {
                        if (hashCode == -1019779949 && key.equals("offset")) {
                            Object value = next.getValue();
                            if (!(value instanceof Double)) {
                                value = null;
                            }
                            Double d = (Double) value;
                            dragRefreshInfo.setOffset(d != null ? Integer.valueOf((int) d.doubleValue()) : null);
                        }
                    } else if (key.equals("hasDragRefresh")) {
                        Object value2 = next.getValue();
                        if (!(value2 instanceof Boolean)) {
                            value2 = null;
                        }
                        dragRefreshInfo.setHasDragRefresh((Boolean) value2);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return dragRefreshInfo;
    }

    @NotNull
    public static final TitleBarInfo d(@NotNull ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "788f765d448f2fc63afb3bef6919afc7", RobustBitConfig.DEFAULT_VALUE)) {
            return (TitleBarInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "788f765d448f2fc63afb3bef6919afc7");
        }
        h.b(readableMap, "$this$toTitleBarInfo");
        TitleBarInfo titleBarInfo = new TitleBarInfo();
        try {
            Iterator<Map.Entry<String, Object>> entryIterator = readableMap.getEntryIterator();
            h.a((Object) entryIterator, "this.entryIterator");
            while (entryIterator.hasNext()) {
                Map.Entry<String, Object> next = entryIterator.next();
                String key = next.getKey();
                if (key != null) {
                    int hashCode = key.hashCode();
                    if (hashCode != -1780721904) {
                        if (hashCode != -614389856) {
                            if (hashCode == 109780401 && key.equals("style")) {
                                Object value = next.getValue();
                                if (!(value instanceof Double)) {
                                    value = null;
                                }
                                Double d = (Double) value;
                                titleBarInfo.setStyle(d != null ? Integer.valueOf((int) d.doubleValue()) : null);
                            }
                        } else if (key.equals(DMKeys.KEY_TITLE_BAR_BAR_ALPHA_THRESHOLD)) {
                            Object value2 = next.getValue();
                            if (!(value2 instanceof Double)) {
                                value2 = null;
                            }
                            Double d2 = (Double) value2;
                            titleBarInfo.setBarAlphaThreshold(d2 != null ? Integer.valueOf((int) d2.doubleValue()) : null);
                        }
                    } else if (key.equals(DMKeys.KEY_TITLE_BAR_BAR_COLOR)) {
                        Object value3 = next.getValue();
                        if (!(value3 instanceof Double)) {
                            value3 = null;
                        }
                        Double d3 = (Double) value3;
                        titleBarInfo.setBarColor(d3 != null ? a((int) d3.doubleValue()) : null);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return titleBarInfo;
    }

    @NotNull
    public static final MPTInfo e(@NotNull ReadableMap readableMap) {
        String str;
        String str2;
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e936428e497db0fe6defe9535b9caba7", RobustBitConfig.DEFAULT_VALUE)) {
            return (MPTInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e936428e497db0fe6defe9535b9caba7");
        }
        h.b(readableMap, "$this$toMPTInfo");
        MPTInfo mPTInfo = new MPTInfo();
        try {
            Iterator<Map.Entry<String, Object>> entryIterator = readableMap.getEntryIterator();
            h.a((Object) entryIterator, "this.entryIterator");
            while (entryIterator.hasNext()) {
                Map.Entry<String, Object> next = entryIterator.next();
                String key = next.getKey();
                if (key != null) {
                    int hashCode = key.hashCode();
                    if (hashCode != 98494) {
                        if (hashCode != 3313798) {
                            if (hashCode == 50511102 && key.equals("category")) {
                                if (next.getValue() == null) {
                                    str = "";
                                } else {
                                    Object value = next.getValue();
                                    if (value == null) {
                                        throw new o("null cannot be cast to non-null type kotlin.String");
                                    }
                                    str = (String) value;
                                }
                                mPTInfo.setCategory(str);
                            }
                        } else if (key.equals("labs")) {
                            ReadableMap map = readableMap.getMap("labs");
                            mPTInfo.setLabs(map != null ? map.toHashMap() : null);
                        }
                    } else if (key.equals("cid")) {
                        if (next.getValue() == null) {
                            str2 = "";
                        } else {
                            Object value2 = next.getValue();
                            if (value2 == null) {
                                throw new o("null cannot be cast to non-null type kotlin.String");
                            }
                            str2 = (String) value2;
                        }
                        mPTInfo.setCid(str2);
                    } else {
                        continue;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return mPTInfo;
    }

    @NotNull
    public static final MGEInfo f(@NotNull ReadableMap readableMap) {
        String str;
        String str2;
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4ff1e1f1c6c979d38eb54b40616792c4", RobustBitConfig.DEFAULT_VALUE)) {
            return (MGEInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4ff1e1f1c6c979d38eb54b40616792c4");
        }
        h.b(readableMap, "$this$toMGEInfo");
        MGEInfo mGEInfo = new MGEInfo();
        try {
            Iterator<Map.Entry<String, Object>> entryIterator = readableMap.getEntryIterator();
            h.a((Object) entryIterator, "this.entryIterator");
            while (entryIterator.hasNext()) {
                Map.Entry<String, Object> next = entryIterator.next();
                String key = next.getKey();
                if (key != null) {
                    int hashCode = key.hashCode();
                    if (hashCode != 97533) {
                        if (hashCode != 98494) {
                            if (hashCode != 3313798) {
                                if (hashCode == 50511102 && key.equals("category")) {
                                    if (next.getValue() == null) {
                                        str = "";
                                    } else {
                                        Object value = next.getValue();
                                        if (value == null) {
                                            throw new o("null cannot be cast to non-null type kotlin.String");
                                        }
                                        str = (String) value;
                                    }
                                    mGEInfo.setCategory(str);
                                }
                            } else if (key.equals("labs")) {
                                ReadableMap map = readableMap.getMap("labs");
                                mGEInfo.setLabs(map != null ? map.toHashMap() : null);
                            }
                        } else if (key.equals("cid")) {
                            Object value2 = next.getValue();
                            if (!(value2 instanceof String)) {
                                value2 = null;
                            }
                            mGEInfo.setCid((String) value2);
                        }
                    } else if (key.equals("bid")) {
                        if (next.getValue() == null) {
                            str2 = "";
                        } else {
                            Object value3 = next.getValue();
                            if (value3 == null) {
                                throw new o("null cannot be cast to non-null type kotlin.String");
                            }
                            str2 = (String) value3;
                        }
                        mGEInfo.setBid(str2);
                    } else {
                        continue;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return mGEInfo;
    }

    @Nullable
    public static final ColorUnionType a(@NotNull Dynamic dynamic) {
        Object[] objArr = {dynamic};
        ChangeQuickRedirect changeQuickRedirect = a;
        ColorUnionType colorUnionType = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aaa82fa1e8e69af0450eade18e6399ac", RobustBitConfig.DEFAULT_VALUE)) {
            return (ColorUnionType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aaa82fa1e8e69af0450eade18e6399ac");
        }
        h.b(dynamic, "$this$toSectionBackgroundColor");
        if (dynamic.getType() == ReadableType.Number) {
            colorUnionType = new ColorUnionType.StringColor(a(dynamic.asInt()));
        } else {
            ReadableMap asMap = dynamic.asMap();
            if (asMap != null) {
                colorUnionType = k(asMap);
            }
        }
        return colorUnionType;
    }

    @NotNull
    public static final MarginInfo g(@NotNull ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "33ed48d8300bf458ac4a2e0333305e53", RobustBitConfig.DEFAULT_VALUE)) {
            return (MarginInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "33ed48d8300bf458ac4a2e0333305e53");
        }
        h.b(readableMap, "$this$toMarginInfo");
        MarginInfo marginInfo = new MarginInfo();
        if (readableMap.hasKey("leftMargin") && !readableMap.isNull("leftMargin")) {
            marginInfo.setLeftMargin(Integer.valueOf(readableMap.getInt("leftMargin")));
        }
        if (readableMap.hasKey("rightMargin") && !readableMap.isNull("rightMargin")) {
            marginInfo.setRightMargin(Integer.valueOf(readableMap.getInt("rightMargin")));
        }
        if (readableMap.hasKey(DMKeys.KEY_MARGIN_TOP_MARGIN) && !readableMap.isNull(DMKeys.KEY_MARGIN_TOP_MARGIN)) {
            marginInfo.setTopMargin(Integer.valueOf(readableMap.getInt(DMKeys.KEY_MARGIN_TOP_MARGIN)));
        }
        if (readableMap.hasKey(DMKeys.KEY_MARGIN_BOTTOM_MARGIN) && !readableMap.isNull(DMKeys.KEY_MARGIN_BOTTOM_MARGIN)) {
            marginInfo.setBottomMargin(Integer.valueOf(readableMap.getInt(DMKeys.KEY_MARGIN_BOTTOM_MARGIN)));
        }
        return marginInfo;
    }

    @NotNull
    public static final MidasInfo h(@NotNull ReadableMap readableMap) {
        String[] strArr;
        HashMap<String, String> hashMap;
        String str;
        String[] strArr2;
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "73ed922343737a79a83a4de2e52fdc70", RobustBitConfig.DEFAULT_VALUE)) {
            return (MidasInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "73ed922343737a79a83a4de2e52fdc70");
        }
        h.b(readableMap, "$this$toMidasInfo");
        MidasInfo midasInfo = new MidasInfo();
        try {
            Iterator<Map.Entry<String, Object>> entryIterator = readableMap.getEntryIterator();
            h.a((Object) entryIterator, "this.entryIterator");
            while (entryIterator.hasNext()) {
                Map.Entry<String, Object> next = entryIterator.next();
                String key = next.getKey();
                if (key != null) {
                    int hashCode = key.hashCode();
                    if (hashCode != -1965055348) {
                        if (hashCode != -191501435) {
                            if (hashCode != 96965648) {
                                if (hashCode == 1195852073 && key.equals("viewURLs")) {
                                    if (next.getValue() instanceof ReadableNativeArray) {
                                        Object value = next.getValue();
                                        if (value == null) {
                                            throw new o("null cannot be cast to non-null type com.facebook.react.bridge.ReadableNativeArray");
                                        }
                                        strArr = a((ReadableNativeArray) value);
                                    } else {
                                        strArr = new String[]{""};
                                    }
                                    midasInfo.setViewURLs(strArr);
                                }
                            } else if (key.equals("extra")) {
                                ReadableMap map = readableMap.getMap("extra");
                                if (map != null) {
                                    Object[] objArr2 = {map};
                                    ChangeQuickRedirect changeQuickRedirect2 = a;
                                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f0b2835fda6b6253365a463ba791749f", RobustBitConfig.DEFAULT_VALUE)) {
                                        hashMap = (HashMap) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f0b2835fda6b6253365a463ba791749f");
                                    } else {
                                        h.b(map, "$this$toStringHashMap");
                                        HashMap<String, String> hashMap2 = new HashMap<>();
                                        HashMap<String, Object> hashMap3 = map.toHashMap();
                                        h.a((Object) hashMap3, "this.toHashMap()");
                                        for (String str2 : hashMap3.keySet()) {
                                            if (str2 == null) {
                                                throw new o("null cannot be cast to non-null type kotlin.String");
                                            }
                                            String str3 = str2;
                                            hashMap2.put(str3, String.valueOf(hashMap3.get(str3)));
                                        }
                                        hashMap = hashMap2;
                                    }
                                } else {
                                    hashMap = null;
                                }
                                midasInfo.setExtra(hashMap);
                            } else {
                                continue;
                            }
                        } else if (key.equals(DMKeys.KEY_MIDAS_FEEDBACK)) {
                            if (next.getValue() == null) {
                                str = "";
                            } else {
                                Object value2 = next.getValue();
                                if (value2 == null) {
                                    throw new o("null cannot be cast to non-null type kotlin.String");
                                }
                                str = (String) value2;
                            }
                            midasInfo.setFeedback(str);
                        } else {
                            continue;
                        }
                    } else if (key.equals("clickURLs")) {
                        if (next.getValue() instanceof ReadableNativeArray) {
                            Object value3 = next.getValue();
                            if (value3 == null) {
                                throw new o("null cannot be cast to non-null type com.facebook.react.bridge.ReadableNativeArray");
                            }
                            strArr2 = a((ReadableNativeArray) value3);
                        } else {
                            strArr2 = new String[]{""};
                        }
                        midasInfo.setClickURLs(strArr2);
                    } else {
                        continue;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return midasInfo;
    }

    @NotNull
    public static final CardStyle i(@NotNull ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b2095e6fa5cfb0e8c39b9bafae174bae", RobustBitConfig.DEFAULT_VALUE)) {
            return (CardStyle) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b2095e6fa5cfb0e8c39b9bafae174bae");
        }
        h.b(readableMap, "$this$toCardStyle");
        CardStyle cardStyle = new CardStyle();
        try {
            Iterator<Map.Entry<String, Object>> entryIterator = readableMap.getEntryIterator();
            h.a((Object) entryIterator, "this.entryIterator");
            while (entryIterator.hasNext()) {
                Map.Entry<String, Object> next = entryIterator.next();
                String key = next.getKey();
                if (key != null) {
                    int hashCode = key.hashCode();
                    if (hashCode != 583595847) {
                        if (hashCode != 975087886) {
                            if (hashCode != 1287124693) {
                                if (hashCode == 1970934485 && key.equals(MarginLeft.LOWER_CASE_NAME)) {
                                    Object value = next.getValue();
                                    if (!(value instanceof Double)) {
                                        value = null;
                                    }
                                    Double d = (Double) value;
                                    cardStyle.marginLeft = d != null ? (int) d.doubleValue() : 0;
                                }
                            } else if (key.equals("backgroundColor")) {
                                Object value2 = next.getValue();
                                if (!(value2 instanceof Double)) {
                                    value2 = null;
                                }
                                Double d2 = (Double) value2;
                                cardStyle.backgroundColor = d2 != null ? a((int) d2.doubleValue()) : null;
                            }
                        } else if (key.equals(MarginRight.LOWER_CASE_NAME)) {
                            Object value3 = next.getValue();
                            if (!(value3 instanceof Double)) {
                                value3 = null;
                            }
                            Double d3 = (Double) value3;
                            cardStyle.marginRight = d3 != null ? (int) d3.doubleValue() : 0;
                        }
                    } else if (key.equals("cornerRadius")) {
                        Object value4 = next.getValue();
                        if (!(value4 instanceof Double)) {
                            value4 = null;
                        }
                        Double d4 = (Double) value4;
                        cardStyle.cornerRadius = d4 != null ? (int) d4.doubleValue() : 0;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return cardStyle;
    }

    @NotNull
    private static String[] a(@NotNull ReadableNativeArray readableNativeArray) {
        Object[] objArr = {readableNativeArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "45013f7dc2441cc4ac3ecb83043bdafe", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "45013f7dc2441cc4ac3ecb83043bdafe");
        }
        h.b(readableNativeArray, "$this$toStringArray");
        ArrayList<Object> arrayList = readableNativeArray.toArrayList();
        h.a((Object) arrayList, "this.toArrayList()");
        Object[] array = arrayList.toArray(new String[arrayList.size()]);
        h.a((Object) array, "list.toArray(arrayOfNulls<String>(list.size))");
        return (String[]) array;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0059, code lost:
        continue;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.dianping.shield.dynamic.model.extra.ActionsConfigurationInfo j(@org.jetbrains.annotations.NotNull com.facebook.react.bridge.ReadableMap r12) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.gcmrnmodule.wrapperviews.base.a.j(com.facebook.react.bridge.ReadableMap):com.dianping.shield.dynamic.model.extra.ActionsConfigurationInfo");
    }

    @NotNull
    public static final ColorUnionType.GradientColorInfo k(@NotNull ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        Integer num = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "65fb281355b5d828563e854d621da087", RobustBitConfig.DEFAULT_VALUE)) {
            return (ColorUnionType.GradientColorInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "65fb281355b5d828563e854d621da087");
        }
        h.b(readableMap, "$this$toGradientColor");
        String str = "#00000000";
        if (readableMap.hasKey(DMKeys.KEY_GRADIENT_COLOR_INFO_START_COLOR) && !readableMap.isNull(DMKeys.KEY_GRADIENT_COLOR_INFO_START_COLOR)) {
            str = a(readableMap.getInt(DMKeys.KEY_GRADIENT_COLOR_INFO_START_COLOR));
        }
        String str2 = "#00000000";
        if (readableMap.hasKey(DMKeys.KEY_GRADIENT_COLOR_INFO_END_COLOR) && !readableMap.isNull(DMKeys.KEY_GRADIENT_COLOR_INFO_END_COLOR)) {
            str2 = a(readableMap.getInt(DMKeys.KEY_GRADIENT_COLOR_INFO_END_COLOR));
        }
        if (readableMap.hasKey(DMKeys.KEY_GRADIENT_COLOR_INFO_ORIENTATION) && !readableMap.isNull(DMKeys.KEY_GRADIENT_COLOR_INFO_ORIENTATION)) {
            num = Integer.valueOf(readableMap.getInt(DMKeys.KEY_GRADIENT_COLOR_INFO_ORIENTATION));
        }
        return new ColorUnionType.GradientColorInfo(str, str2, num);
    }

    @NotNull
    public static final String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3983701ea51b41c72abd3ae9bb59d5ae", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3983701ea51b41c72abd3ae9bb59d5ae");
        }
        String a2 = com.dianping.gcmrnmodule.utils.b.a(com.dianping.gcmrnmodule.utils.b.a(i));
        h.a((Object) a2, "rgb2Hex(argb)");
        return a2;
    }
}
