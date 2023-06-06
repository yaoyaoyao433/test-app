package com.sankuai.waimai.store.imageloader;

import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.config.j;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.util.monitor.c;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
import com.sankuai.waimai.store.util.monitor.monitor.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class ImageLoaderMonitor {
    public static ChangeQuickRedirect a;
    private static final ImageLoaderMonitor e = new ImageLoaderMonitor();
    final Map<String, List<a>> b;
    final int c;
    final long d;
    private final int f;

    public static ImageLoaderMonitor a() {
        return e;
    }

    public ImageLoaderMonitor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "321edd3fafeee44022a32ff75b5287eb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "321edd3fafeee44022a32ff75b5287eb");
            return;
        }
        this.b = new ConcurrentHashMap();
        j.h().a("sniffer/image_monitor_info", new TypeToken<HashMap<String, Object>>() { // from class: com.sankuai.waimai.store.imageloader.ImageLoaderMonitor.1
        }.getType());
        this.c = j.h().a("sniffer/image_monitor_info/total_image_count", 15);
        this.f = j.h().a("sniffer/image_monitor_info/single_image_count", 3);
        this.d = j.h().a("sniffer/image_monitor_info/interval_minutes", 5) * 60 * 1000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "568b808d2c85be9f8cc37a6a7be3ebe5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "568b808d2c85be9f8cc37a6a7be3ebe5");
            return;
        }
        Set<Map.Entry<String, List<a>>> entrySet = this.b.entrySet();
        ArrayList<String> arrayList = new ArrayList();
        for (Map.Entry<String, List<a>> entry : entrySet) {
            if (entry != null) {
                List<a> value = entry.getValue();
                if (com.sankuai.shangou.stone.util.a.b(value)) {
                    arrayList.add(entry.getKey());
                } else {
                    a aVar = value.get(0);
                    if (aVar == null) {
                        arrayList.add(entry.getKey());
                    } else if (SystemClock.elapsedRealtime() - aVar.b > this.d) {
                        arrayList.add(entry.getKey());
                    }
                }
            }
        }
        for (String str : arrayList) {
            this.b.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ae13e54a13517070fbdcd42692ee329", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ae13e54a13517070fbdcd42692ee329");
            return;
        }
        Set<Map.Entry<String, List<a>>> entrySet = this.b.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<a>> entry : entrySet) {
            if (entry != null && com.sankuai.shangou.stone.util.a.a((List) entry.getValue()) >= this.f && a(entry.getValue())) {
                arrayList.add(entry.getKey());
            }
        }
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) arrayList)) {
            ImageLoaderIMonitor imageLoaderIMonitor = ImageLoaderIMonitor.Exception;
            String a2 = i.a(arrayList);
            c.a(imageLoaderIMonitor, a2, ((this.d / 60) / 1000) + "分钟单张图片失败的次数大于" + this.f + "次");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(List<a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bcabc11b57ba665f8d99e6aceeae4b9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bcabc11b57ba665f8d99e6aceeae4b9")).booleanValue();
        }
        if (com.sankuai.shangou.stone.util.a.a((List) list) <= 1) {
            return false;
        }
        a aVar = (a) com.sankuai.shangou.stone.util.a.a((List<Object>) list, 0);
        a aVar2 = (a) com.sankuai.shangou.stone.util.a.a((List<Object>) list, list.size() - 1);
        return (aVar == null || aVar2 == null || Math.abs(aVar2.b - aVar.b) >= this.d) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public List<a> a(@NonNull Map<String, List<a>> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30cdd502e667cd1af0ef95b2f5c1c0ab", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30cdd502e667cd1af0ef95b2f5c1c0ab");
        }
        ArrayList arrayList = new ArrayList();
        for (List<a> list : map.values()) {
            arrayList.addAll(list);
        }
        Collections.sort(arrayList, new Comparator<a>() { // from class: com.sankuai.waimai.store.imageloader.ImageLoaderMonitor.2
            public static ChangeQuickRedirect a;

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(a aVar, a aVar2) {
                a aVar3 = aVar;
                a aVar4 = aVar2;
                Object[] objArr2 = {aVar3, aVar4};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fcd412c5e1777065dc21ee09d8d7c046", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fcd412c5e1777065dc21ee09d8d7c046")).intValue() : (aVar3 == null || aVar4 == null || aVar3.b <= aVar4.b) ? 0 : 1;
            }
        });
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        final long b;
        @SerializedName("url")
        private final String c;

        private a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26473d4df60c615ddea4976bb35ca622", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26473d4df60c615ddea4976bb35ca622");
                return;
            }
            this.c = str;
            this.b = SystemClock.elapsedRealtime();
        }

        public final boolean equals(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e9a5856f52c440cc39fc2b433aea9a7", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e9a5856f52c440cc39fc2b433aea9a7")).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return TextUtils.equals(this.c, ((a) obj).c);
        }

        public final int hashCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c5d41b23a48d11d6881f55a2fa67f8e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c5d41b23a48d11d6881f55a2fa67f8e")).intValue() : Objects.hash(this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public enum ImageLoaderIMonitor implements IMonitor {
        Exception;
        
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
        public final boolean a() {
            return false;
        }

        ImageLoaderIMonitor() {
            Object[] objArr = {r10, 0};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddc545a1bf7e6931cdab7d329cb30af0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddc545a1bf7e6931cdab7d329cb30af0");
            }
        }

        public static ImageLoaderIMonitor valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e2b5347335e3dccedc6683ed04a2d7b0", RobustBitConfig.DEFAULT_VALUE) ? (ImageLoaderIMonitor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e2b5347335e3dccedc6683ed04a2d7b0") : (ImageLoaderIMonitor) Enum.valueOf(ImageLoaderIMonitor.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static ImageLoaderIMonitor[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4dcdc6f71e0dea9d1384d0fbd25440de", RobustBitConfig.DEFAULT_VALUE) ? (ImageLoaderIMonitor[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4dcdc6f71e0dea9d1384d0fbd25440de") : (ImageLoaderIMonitor[]) values().clone();
        }

        @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
        public final com.sankuai.waimai.store.util.monitor.monitor.c b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "462d908d590daade7349b935b5aa06df", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.util.monitor.monitor.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "462d908d590daade7349b935b5aa06df") : new com.sankuai.waimai.store.util.monitor.monitor.c() { // from class: com.sankuai.waimai.store.imageloader.ImageLoaderMonitor.ImageLoaderIMonitor.1
                @Override // com.sankuai.waimai.store.util.monitor.monitor.c
                public final b b() {
                    return b.URGENT;
                }
            };
        }
    }
}
