package com.meituan.msc.views.text;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.util.LruCache;
import com.google.gson.Gson;
import com.meituan.msc.jse.bridge.ReadableArray;
import com.meituan.msc.jse.bridge.ReadableMap;
import com.meituan.msc.uimanager.ab;
import com.meituan.msc.uimanager.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class q {
    public static ChangeQuickRedirect a;
    private static final TextPaint b = new TextPaint(1);
    private static final Object c = new Object();
    private static final LruCache<String, com.meituan.msc.mmpviews.text.a> d = new LruCache<>(100);
    private static final LruCache<String, Spannable> e = new LruCache<>(100);

    private static void a(Context context, ReadableArray readableArray, SpannableStringBuilder spannableStringBuilder, List<a> list) {
        int i = 0;
        int i2 = 1;
        Object[] objArr = {context, readableArray, spannableStringBuilder, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "93d70dfd612ec7b6143679464b48ab14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "93d70dfd612ec7b6143679464b48ab14");
            return;
        }
        int size = readableArray.size();
        while (i < size) {
            ReadableMap map = readableArray.getMap(i);
            int length = spannableStringBuilder.length();
            m mVar = new m(new ab(map.getMap("textAttributes")));
            spannableStringBuilder.append((CharSequence) r.a(map.getString("string"), mVar.n));
            int length2 = spannableStringBuilder.length();
            int i3 = map.getInt("reactTag");
            if (map.hasKey("isAttachment") && map.getBoolean("isAttachment")) {
                list.add(new a(spannableStringBuilder.length() - i2, spannableStringBuilder.length(), new p(i3, (int) s.b(map.getDouble("width")), (int) s.b(map.getDouble("height")))));
            } else if (length2 >= length) {
                if (mVar.c) {
                    list.add(new a(length, length2, new ReactForegroundColorSpan(mVar.e)));
                }
                if (mVar.f) {
                    list.add(new a(length, length2, new ReactBackgroundColorSpan(mVar.g)));
                }
                if (Build.VERSION.SDK_INT >= 21 && !Float.isNaN(mVar.b())) {
                    list.add(new a(length, length2, new com.meituan.msc.views.text.a(mVar.b())));
                }
                list.add(new a(length, length2, new ReactAbsoluteSizeSpan(mVar.i)));
                if (mVar.v != -1 || mVar.w != -1 || mVar.x != null) {
                    list.add(new a(length, length2, new c(mVar.v, mVar.w, mVar.y, mVar.x, context.getAssets())));
                }
                if (mVar.s) {
                    list.add(new a(length, length2, new ReactUnderlineSpan()));
                }
                if (mVar.t) {
                    list.add(new a(length, length2, new ReactStrikethroughSpan()));
                }
                if (mVar.o != 0.0f || mVar.p != 0.0f) {
                    list.add(new a(length, length2, new l(mVar.o, mVar.p, mVar.q, mVar.r)));
                }
                if (!Float.isNaN(mVar.a())) {
                    list.add(new a(length, length2, new b(mVar.a())));
                }
                list.add(new a(length, length2, new h(i3)));
            }
            i++;
            i2 = 1;
        }
    }

    public static com.meituan.msc.mmpviews.text.a a(Context context, ReadableMap readableMap, @Nullable j jVar) {
        Object[] objArr = {context, readableMap, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "47ebf861153a510a6b505351f3c69bc9", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.mmpviews.text.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "47ebf861153a510a6b505351f3c69bc9");
        }
        String obj = readableMap.toString();
        synchronized (d) {
            com.meituan.msc.mmpviews.text.a aVar = d.get(obj);
            if (aVar != null) {
                return aVar;
            }
            Object[] objArr2 = {context, readableMap, jVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            com.meituan.msc.mmpviews.text.a aVar2 = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "88e7ed1e145d614e2359fe3b8e3fa317", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msc.mmpviews.text.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "88e7ed1e145d614e2359fe3b8e3fa317") : (com.meituan.msc.mmpviews.text.a) new Gson().fromJson(readableMap.getString("leafNodeInfo"), (Class<Object>) com.meituan.msc.mmpviews.text.a.class);
            synchronized (d) {
                d.put(obj, aVar2);
            }
            return aVar2;
        }
    }

    public static Spannable b(Context context, ReadableMap readableMap, @Nullable j jVar) {
        Spannable spannable;
        int i = 0;
        Object[] objArr = {context, readableMap, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "04eff8755adff79dc06a9b6ce10b6745", RobustBitConfig.DEFAULT_VALUE)) {
            return (Spannable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "04eff8755adff79dc06a9b6ce10b6745");
        }
        String obj = readableMap.toString();
        synchronized (c) {
            Spannable spannable2 = e.get(obj);
            if (spannable2 != null) {
                return spannable2;
            }
            Object[] objArr2 = {context, readableMap, jVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "46d331ab25e018af961be66cb0231d16", RobustBitConfig.DEFAULT_VALUE)) {
                spannable = (Spannable) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "46d331ab25e018af961be66cb0231d16");
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                ArrayList<a> arrayList = new ArrayList();
                a(context, readableMap.getArray("fragments"), spannableStringBuilder, arrayList);
                for (a aVar : arrayList) {
                    aVar.a(spannableStringBuilder, i);
                    i++;
                }
                spannable = spannableStringBuilder;
            }
            synchronized (c) {
                e.put(obj, spannable);
            }
            return spannable;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        protected int b;
        protected int c;
        protected g d;

        public a(int i, int i2, g gVar) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), gVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "886a70545e8c7f1b17e83f7aa260a212", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "886a70545e8c7f1b17e83f7aa260a212");
                return;
            }
            this.b = i;
            this.c = i2;
            this.d = gVar;
        }

        public final void a(SpannableStringBuilder spannableStringBuilder, int i) {
            Object[] objArr = {spannableStringBuilder, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "508e5ed4d3bbb81b1ed91501d0da9934", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "508e5ed4d3bbb81b1ed91501d0da9934");
            } else {
                spannableStringBuilder.setSpan(this.d, this.b, this.c, ((i << 16) & 16711680) | ((this.b == 0 ? 18 : 34) & (-16711681)));
            }
        }
    }
}
