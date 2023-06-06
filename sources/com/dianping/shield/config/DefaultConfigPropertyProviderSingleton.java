package com.dianping.shield.config;

import com.dianping.portal.feature.b;
import com.dianping.portal.feature.c;
import com.dianping.portal.feature.g;
import com.dianping.shield.bridge.ShieldLogger;
import com.dianping.shield.env.ShieldEnvironment;
import com.google.gson.Gson;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0014\u001a\u00020\u0004H\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\bH\u0016J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0004H\u0002J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\fH\u0016J\u0018\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R#\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/dianping/shield/config/DefaultConfigPropertyProviderSingleton;", "Lcom/dianping/portal/feature/ConfigPropertyProviderInterface;", "()V", "KEY_CONFIG", "", "propertyChangeListenerHashMap", "Ljava/util/HashMap;", "Ljava/util/ArrayList;", "Lcom/dianping/portal/feature/ConfigPropertyChangeListener;", "getPropertyChangeListenerHashMap", "()Ljava/util/HashMap;", "propertyHolderHashMap", "Lcom/dianping/portal/feature/PropertyHolderInterface;", "getPropertyHolderHashMap", "propertyValuesHashMap", "", "getPropertyValuesHashMap", "setPropertyValuesHashMap", "(Ljava/util/HashMap;)V", "getConfigProperty", "propertyKey", "getConfigPropertyHolder", "registerConfigProperty", "", "configPropertyChangeListener", "saveHornCache", "setPropertyHolderInterface", "", "propertyHolderInterface", "unRegisterConfigProperty", "HornCallbackImpl", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DefaultConfigPropertyProviderSingleton implements c {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final DefaultConfigPropertyProviderSingleton INSTANCE = new DefaultConfigPropertyProviderSingleton();
    private static final String KEY_CONFIG = KEY_CONFIG;
    private static final String KEY_CONFIG = KEY_CONFIG;
    @NotNull
    private static final HashMap<String, g> propertyHolderHashMap = new HashMap<>();
    @NotNull
    private static final HashMap<String, ArrayList<b>> propertyChangeListenerHashMap = new HashMap<>();
    @NotNull
    private static HashMap<String, Object> propertyValuesHashMap = new HashMap<>();

    static {
        Horn.register(KEY_CONFIG, new HornCallbackImpl());
    }

    @NotNull
    public final HashMap<String, g> getPropertyHolderHashMap() {
        return propertyHolderHashMap;
    }

    @NotNull
    public final HashMap<String, ArrayList<b>> getPropertyChangeListenerHashMap() {
        return propertyChangeListenerHashMap;
    }

    @NotNull
    public final HashMap<String, Object> getPropertyValuesHashMap() {
        return propertyValuesHashMap;
    }

    public final void setPropertyValuesHashMap(@NotNull HashMap<String, Object> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7dabf9d9dda0dbba1cde278c9b6e2218", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7dabf9d9dda0dbba1cde278c9b6e2218");
            return;
        }
        h.b(hashMap, "<set-?>");
        propertyValuesHashMap = hashMap;
    }

    @Override // com.dianping.portal.feature.c
    @Nullable
    public final String getConfigProperty(@NotNull String str) {
        String obj;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8bb845ba0d70618d1829297bd652dcc9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8bb845ba0d70618d1829297bd652dcc9");
        }
        h.b(str, "propertyKey");
        Object obj2 = propertyValuesHashMap.get(str);
        if (obj2 == null || (obj = obj2.toString()) == null || obj == null) {
            INSTANCE.saveHornCache(str);
            return "";
        }
        return obj;
    }

    @Override // com.dianping.portal.feature.c
    public final void registerConfigProperty(@NotNull String str, @NotNull b bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a577bd8af73ae9ea5d51bc0714252d99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a577bd8af73ae9ea5d51bc0714252d99");
            return;
        }
        h.b(str, "propertyKey");
        h.b(bVar, "configPropertyChangeListener");
        if (propertyChangeListenerHashMap.containsKey(str)) {
            return;
        }
        HashMap<String, ArrayList<b>> hashMap = propertyChangeListenerHashMap;
        ArrayList<b> arrayList = new ArrayList<>();
        arrayList.add(bVar);
        hashMap.put(str, arrayList);
    }

    @Override // com.dianping.portal.feature.c
    @Nullable
    public final g getConfigPropertyHolder(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c8df15de8bf23b3823e5d91e157d17dd", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c8df15de8bf23b3823e5d91e157d17dd");
        }
        h.b(str, "propertyKey");
        return propertyHolderHashMap.get(str);
    }

    @Override // com.dianping.portal.feature.c
    public final boolean setPropertyHolderInterface(@NotNull String str, @NotNull g gVar) {
        Object[] objArr = {str, gVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "74f9f6f8bcc83eccf9b3301e93b57c35", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "74f9f6f8bcc83eccf9b3301e93b57c35")).booleanValue();
        }
        h.b(str, "propertyKey");
        h.b(gVar, "propertyHolderInterface");
        ArrayList<b> arrayList = propertyChangeListenerHashMap.get(str);
        if (arrayList != null) {
            return arrayList.equals(gVar);
        }
        propertyHolderHashMap.put(str, gVar);
        return true;
    }

    private final void saveHornCache(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0808530abc0e56303ef6c00f71400f7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0808530abc0e56303ef6c00f71400f7d");
        } else {
            Horn.accessCache(KEY_CONFIG, new HornCallback() { // from class: com.dianping.shield.config.DefaultConfigPropertyProviderSingleton$saveHornCache$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.horn.HornCallback
                public final void onChanged(boolean z, String str2) {
                    boolean z2 = false;
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str2};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3145fbfa33f24741fcefb47f3888a93b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3145fbfa33f24741fcefb47f3888a93b");
                    } else if (z) {
                        String str3 = str2;
                        if ((str3 == null || str3.length() == 0) ? true : true) {
                            return;
                        }
                        try {
                            DefaultConfigPropertyProviderSingleton defaultConfigPropertyProviderSingleton = DefaultConfigPropertyProviderSingleton.INSTANCE;
                            Object fromJson = new Gson().fromJson(str2, (Class<Object>) HashMap.class);
                            if (fromJson == null) {
                                throw new o("null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any>");
                            }
                            defaultConfigPropertyProviderSingleton.setPropertyValuesHashMap((HashMap) fromJson);
                            String.valueOf(DefaultConfigPropertyProviderSingleton.INSTANCE.getPropertyValuesHashMap().get(str));
                        } catch (Exception e) {
                            ShieldLogger shieldLogger = ShieldEnvironment.INSTANCE.getShieldLogger();
                            ShieldLogger.codeLogError$default(shieldLogger, DefaultConfigPropertyProviderSingleton.class, str + " need fetch horn cache，exception: " + e.getMessage(), null, 4, null);
                        }
                    }
                }
            });
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/dianping/shield/config/DefaultConfigPropertyProviderSingleton$HornCallbackImpl;", "Lcom/meituan/android/common/horn/HornCallback;", "()V", "onChanged", "", "enable", "", "result", "", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class HornCallbackImpl implements HornCallback {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // com.meituan.android.common.horn.HornCallback
        public final void onChanged(boolean z, @Nullable String str) {
            boolean z2 = false;
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9653c7f240a2a2f5df97be78e0943104", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9653c7f240a2a2f5df97be78e0943104");
            } else if (z) {
                String str2 = str;
                if ((str2 == null || str2.length() == 0) ? true : true) {
                    return;
                }
                try {
                    DefaultConfigPropertyProviderSingleton defaultConfigPropertyProviderSingleton = DefaultConfigPropertyProviderSingleton.INSTANCE;
                    Object fromJson = new Gson().fromJson(str, (Class<Object>) HashMap.class);
                    if (fromJson == null) {
                        throw new o("null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any>");
                    }
                    defaultConfigPropertyProviderSingleton.setPropertyValuesHashMap((HashMap) fromJson);
                    for (Map.Entry<String, g> entry : DefaultConfigPropertyProviderSingleton.INSTANCE.getPropertyHolderHashMap().entrySet()) {
                        g value = entry.getValue();
                        Object obj = DefaultConfigPropertyProviderSingleton.INSTANCE.getPropertyValuesHashMap().get(entry.getKey());
                        if (obj != null) {
                            value.notifyConfigDataChange(obj.toString());
                        }
                    }
                    for (Map.Entry<String, ArrayList<b>> entry2 : DefaultConfigPropertyProviderSingleton.INSTANCE.getPropertyChangeListenerHashMap().entrySet()) {
                        String key = entry2.getKey();
                        Iterator<T> it = entry2.getValue().iterator();
                        while (it.hasNext()) {
                            it.next();
                            DefaultConfigPropertyProviderSingleton.INSTANCE.getPropertyValuesHashMap().get(key);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // com.dianping.portal.feature.c
    public final void unRegisterConfigProperty(@NotNull String str, @NotNull b bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06cb61e8fe62e9e83fb370e6caedfcc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06cb61e8fe62e9e83fb370e6caedfcc9");
            return;
        }
        h.b(str, "propertyKey");
        h.b(bVar, "configPropertyChangeListener");
        ArrayList<b> arrayList = propertyChangeListenerHashMap.get(str);
        if (arrayList != null) {
            arrayList.remove(bVar);
        }
        ArrayList<b> arrayList2 = propertyChangeListenerHashMap.get(str);
        if (arrayList2 != null) {
            arrayList2.isEmpty();
            propertyChangeListenerHashMap.remove(str);
        }
    }
}
