package com.dianping.shield.component.extensions.gridsection;

import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0005J\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005H\u0002J\u0016\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000bJ\u0016\u0010\u0012\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u000eJ\u0006\u0010\u0014\u001a\u00020\u000eR*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/dianping/shield/component/extensions/gridsection/GridRecycledViewPool;", "", "()V", "scrapMap", "Ljava/util/HashMap;", "", "Lcom/dianping/shield/component/extensions/gridsection/GridRecycledViewPool$ScrapData;", "Lkotlin/collections/HashMap;", KNBConfig.CONFIG_CLEAR_CACHE, "", "getRecycledView", "Lcom/dianping/shield/node/adapter/ShieldViewHolder;", DMKeys.KEY_VIEW_TYPE, "getRecycledViewCount", "", "getScrapDataForType", "putRecycledView", "viewHolder", "setMaxRecycledViews", "max", JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, "ScrapData", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class GridRecycledViewPool {
    public static ChangeQuickRedirect changeQuickRedirect;
    private HashMap<String, ScrapData> scrapMap;

    public GridRecycledViewPool() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "16149509dbbaae42d2f8124a0fa2ff60", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "16149509dbbaae42d2f8124a0fa2ff60");
        } else {
            this.scrapMap = new HashMap<>();
        }
    }

    private final ScrapData getScrapDataForType(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52f61bd1c160b5f9483532913a25e995", RobustBitConfig.DEFAULT_VALUE)) {
            return (ScrapData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52f61bd1c160b5f9483532913a25e995");
        }
        if (this.scrapMap.containsKey(str)) {
            ScrapData scrapData = this.scrapMap.get(str);
            if (scrapData == null) {
                ScrapData scrapData2 = new ScrapData();
                this.scrapMap.put(str, scrapData2);
                return scrapData2;
            }
            return scrapData;
        }
        ScrapData scrapData3 = new ScrapData();
        this.scrapMap.put(str, scrapData3);
        return scrapData3;
    }

    public final void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f39956440dbe25466f67cf781c34a9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f39956440dbe25466f67cf781c34a9b");
            return;
        }
        for (Map.Entry<String, ScrapData> entry : this.scrapMap.entrySet()) {
            entry.getValue().getScrapHeap().clear();
        }
    }

    public final void setMaxRecycledViews(@NotNull String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df2a7faf1d1c018c3a249ea45bd274f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df2a7faf1d1c018c3a249ea45bd274f5");
            return;
        }
        h.b(str, DMKeys.KEY_VIEW_TYPE);
        ScrapData scrapDataForType = getScrapDataForType(str);
        scrapDataForType.setMaxScrap(i);
        ArrayList<ShieldViewHolder> scrapHeap = scrapDataForType.getScrapHeap();
        while (scrapHeap.size() > i) {
            scrapHeap.remove(scrapHeap.size() - 1);
        }
    }

    @Nullable
    public final ShieldViewHolder getRecycledView(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dead11842078e9359537d7510ed9366e", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldViewHolder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dead11842078e9359537d7510ed9366e");
        }
        h.b(str, DMKeys.KEY_VIEW_TYPE);
        ScrapData scrapData = this.scrapMap.get(str);
        if (scrapData == null) {
            return null;
        }
        h.a((Object) scrapData, "scrapMap.get(viewType) ?: return null");
        ArrayList<ShieldViewHolder> scrapHeap = scrapData.getScrapHeap();
        if (scrapHeap.isEmpty()) {
            return null;
        }
        return scrapHeap.remove(scrapHeap.size() - 1);
    }

    public final void putRecycledView(@NotNull String str, @NotNull ShieldViewHolder shieldViewHolder) {
        Object[] objArr = {str, shieldViewHolder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be05e59e2fa50719f6381f26ffcc95c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be05e59e2fa50719f6381f26ffcc95c9");
            return;
        }
        h.b(str, DMKeys.KEY_VIEW_TYPE);
        h.b(shieldViewHolder, "viewHolder");
        ScrapData scrapDataForType = getScrapDataForType(str);
        if (scrapDataForType.getScrapHeap().size() < scrapDataForType.getMaxScrap() && !scrapDataForType.getScrapHeap().contains(shieldViewHolder)) {
            scrapDataForType.getScrapHeap().add(shieldViewHolder);
        }
    }

    public final int getRecycledViewCount(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "003e7c17c75fa2bac652b78dfc5cad22", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "003e7c17c75fa2bac652b78dfc5cad22")).intValue();
        }
        if (str != null) {
            return getScrapDataForType(str).getScrapHeap().size();
        }
        return 0;
    }

    public final int size() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5914dd1de0a7e741ec6e0cd856c381dd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5914dd1de0a7e741ec6e0cd856c381dd")).intValue();
        }
        for (Map.Entry<String, ScrapData> entry : this.scrapMap.entrySet()) {
            i += entry.getValue().getScrapHeap().size();
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/dianping/shield/component/extensions/gridsection/GridRecycledViewPool$ScrapData;", "", "()V", "DEFAULT_MAX_SCRAP", "", "maxScrap", "getMaxScrap", "()I", "setMaxScrap", "(I)V", "scrapHeap", "Ljava/util/ArrayList;", "Lcom/dianping/shield/node/adapter/ShieldViewHolder;", "Lkotlin/collections/ArrayList;", "getScrapHeap", "()Ljava/util/ArrayList;", "setScrapHeap", "(Ljava/util/ArrayList;)V", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class ScrapData {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final int DEFAULT_MAX_SCRAP;
        private int maxScrap;
        @NotNull
        private ArrayList<ShieldViewHolder> scrapHeap;

        public ScrapData() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a71431a3b2820b8568517bfff56cd5c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a71431a3b2820b8568517bfff56cd5c");
                return;
            }
            this.DEFAULT_MAX_SCRAP = 20;
            this.scrapHeap = new ArrayList<>();
            this.maxScrap = this.DEFAULT_MAX_SCRAP;
        }

        @NotNull
        public final ArrayList<ShieldViewHolder> getScrapHeap() {
            return this.scrapHeap;
        }

        public final void setScrapHeap(@NotNull ArrayList<ShieldViewHolder> arrayList) {
            Object[] objArr = {arrayList};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8d2d6f253e8aa5c7179353157965981", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8d2d6f253e8aa5c7179353157965981");
                return;
            }
            h.b(arrayList, "<set-?>");
            this.scrapHeap = arrayList;
        }

        public final int getMaxScrap() {
            return this.maxScrap;
        }

        public final void setMaxScrap(int i) {
            this.maxScrap = i;
        }
    }
}
