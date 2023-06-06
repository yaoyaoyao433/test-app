package com.bumptech.glide.load.engine.bitmap_recycle;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import com.meituan.robust.common.CommonConstant;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
/* compiled from: ProGuard */
@TargetApi(19)
/* loaded from: classes.dex */
public final class i implements g {
    private static final Bitmap.Config[] a = {Bitmap.Config.ARGB_8888, null};
    private static final Bitmap.Config[] b = {Bitmap.Config.RGB_565};
    private static final Bitmap.Config[] c = {Bitmap.Config.ARGB_4444};
    private static final Bitmap.Config[] d = {Bitmap.Config.ALPHA_8};
    private final b e = new b();
    private final e<a, Bitmap> f = new e<>();
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> g = new HashMap();

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.g
    public final void a(Bitmap bitmap) {
        a a2 = this.e.a(com.bumptech.glide.util.h.a(bitmap), bitmap.getConfig());
        this.f.a(a2, bitmap);
        NavigableMap<Integer, Integer> a3 = a(bitmap.getConfig());
        Integer num = (Integer) a3.get(Integer.valueOf(a2.a));
        a3.put(Integer.valueOf(a2.a), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.g
    public final Bitmap a(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int a2 = com.bumptech.glide.util.h.a(i, i2, config);
        a a3 = this.e.a(a2, config);
        int i3 = 0;
        switch (AnonymousClass1.a[config.ordinal()]) {
            case 1:
                configArr = a;
                break;
            case 2:
                configArr = b;
                break;
            case 3:
                configArr = c;
                break;
            case 4:
                configArr = d;
                break;
            default:
                configArr = new Bitmap.Config[]{config};
                break;
        }
        int length = configArr.length;
        while (true) {
            if (i3 < length) {
                Bitmap.Config config2 = configArr[i3];
                Integer ceilingKey = a(config2).ceilingKey(Integer.valueOf(a2));
                if (ceilingKey == null || ceilingKey.intValue() > a2 * 8) {
                    i3++;
                } else if (ceilingKey.intValue() != a2 || (config2 != null ? !config2.equals(config) : config != null)) {
                    this.e.a(a3);
                    a3 = this.e.a(ceilingKey.intValue(), config2);
                }
            }
        }
        Bitmap a4 = this.f.a((e<a, Bitmap>) a3);
        if (a4 != null) {
            a(Integer.valueOf(com.bumptech.glide.util.h.a(a4)), a4.getConfig());
            a4.reconfigure(i, i2, a4.getConfig() != null ? a4.getConfig() : Bitmap.Config.ARGB_8888);
        }
        return a4;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.g
    public final Bitmap a() {
        Bitmap a2 = this.f.a();
        if (a2 != null) {
            a(Integer.valueOf(com.bumptech.glide.util.h.a(a2)), a2.getConfig());
        }
        return a2;
    }

    private void a(Integer num, Bitmap.Config config) {
        NavigableMap<Integer, Integer> a2 = a(config);
        Integer num2 = (Integer) a2.get(num);
        if (num2.intValue() == 1) {
            a2.remove(num);
        } else {
            a2.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    private NavigableMap<Integer, Integer> a(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.g.get(config);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.g.put(config, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.g
    public final String b(Bitmap bitmap) {
        return b(com.bumptech.glide.util.h.a(bitmap), bitmap.getConfig());
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.g
    public final String b(int i, int i2, Bitmap.Config config) {
        return b(com.bumptech.glide.util.h.a(i, i2, config), config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.g
    public final int c(Bitmap bitmap) {
        return com.bumptech.glide.util.h.a(bitmap);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SizeConfigStrategy{groupedMap=");
        sb.append(this.f);
        sb.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.g.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.g.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class b extends com.bumptech.glide.load.engine.bitmap_recycle.b<a> {
        b() {
        }

        public final a a(int i, Bitmap.Config config) {
            a b = b();
            b.a = i;
            b.b = config;
            return b;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.b
        protected final /* synthetic */ a a() {
            return new a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class a implements h {
        int a;
        Bitmap.Config b;
        private final b c;

        public a(b bVar) {
            this.c = bVar;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.h
        public final void a() {
            this.c.a(this);
        }

        public final String toString() {
            return i.b(this.a, this.b);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.a == aVar.a) {
                    if (this.b == null) {
                        if (aVar.b == null) {
                            return true;
                        }
                    } else if (this.b.equals(aVar.b)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        public final int hashCode() {
            return (this.a * 31) + (this.b != null ? this.b.hashCode() : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + CommonConstant.Symbol.BRACKET_RIGHT;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.i$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[Bitmap.Config.values().length];

        static {
            try {
                a[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }
}
