package com.meituan.msi.lib.map.view.model;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.lib.map.utils.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptorFactory;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.PolylineOptions;
import com.sankuai.meituan.mapsdk.maps.model.animation.Animation;
import com.sankuai.meituan.mapsdk.maps.model.animation.EmergeAnimation;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class r {
    public static ChangeQuickRedirect a;
    final MsiContext b;
    public final List<q> c;
    public com.meituan.msi.lib.map.view.map.e d;
    public final List<q> e;
    public int f;
    public q g;
    public boolean h;
    private final MTMap i;
    private final JsonObject j;

    public r(MTMap mTMap, MsiContext msiContext, JsonObject jsonObject, List<q> list, List<q> list2) {
        Object[] objArr = {mTMap, msiContext, jsonObject, list, list2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35dddf7d89ed0d00bf9ae038fdf181c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35dddf7d89ed0d00bf9ae038fdf181c7");
            return;
        }
        this.f = 0;
        this.g = null;
        this.h = false;
        this.i = mTMap;
        this.b = msiContext;
        this.j = jsonObject;
        this.c = list;
        this.e = list2;
    }

    public final void a() {
        q qVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "048e8186572133ff570d719f03060764", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "048e8186572133ff570d719f03060764");
        } else if (3 == this.f) {
            a(this.j);
        } else if (this.j.has("lines")) {
            JsonArray asJsonArray = this.j.get("lines").getAsJsonArray();
            if (this.f == 0) {
                int size = this.c.size();
                for (int i = 0; i < size; i++) {
                    if (!this.c.get(i).i && (qVar = this.c.get(i)) != null) {
                        qVar.b();
                    }
                }
                this.c.clear();
            }
            for (int i2 = 0; i2 < asJsonArray.size(); i2++) {
                JsonObject asJsonObject = asJsonArray.get(i2).getAsJsonObject();
                if (2 == this.f) {
                    if (asJsonObject.has("id")) {
                        int asInt = asJsonObject.get("id").getAsInt();
                        Iterator<q> it = this.c.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            q next = it.next();
                            if (next.d == asInt) {
                                this.g = next;
                                this.h = true;
                                break;
                            }
                        }
                        if (this.g == null) {
                        }
                    }
                }
                a(asJsonObject, false);
                this.b.onSuccess(null);
            }
        }
    }

    private void a(JsonObject jsonObject, q qVar) {
        Object[] objArr = {jsonObject, qVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4478debde8f591a7126e738da180e9d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4478debde8f591a7126e738da180e9d0");
            return;
        }
        PolylineOptions.Text.Builder builder = null;
        if (jsonObject.has("segmentTexts")) {
            ArrayList arrayList = new ArrayList();
            JsonArray asJsonArray = jsonObject.get("segmentTexts").getAsJsonArray();
            for (int i = 0; i < asJsonArray.size(); i++) {
                JsonObject asJsonObject = asJsonArray.get(i).getAsJsonObject();
                int asInt = asJsonObject.has("startIndex") ? asJsonObject.get("startIndex").getAsInt() : 0;
                int asInt2 = asJsonObject.has("endIndex") ? asJsonObject.get("endIndex").getAsInt() : 0;
                String str = "";
                if (asJsonObject.has("name")) {
                    str = asJsonObject.get("name").getAsString();
                }
                arrayList.add(new PolylineOptions.SegmentText(asInt, asInt2, str));
            }
            builder = new PolylineOptions.Text.Builder(arrayList);
        }
        if (builder == null) {
            return;
        }
        if (jsonObject.has("textStyle")) {
            JsonObject asJsonObject2 = jsonObject.get("textStyle").getAsJsonObject();
            if (asJsonObject2.has("textColor")) {
                builder.color(com.meituan.msi.lib.map.utils.a.a(asJsonObject2.get("textColor").getAsString(), "textColor"));
            }
            if (asJsonObject2.has("strokeColor")) {
                builder.strokeColor(com.meituan.msi.lib.map.utils.a.a(asJsonObject2.get("strokeColor").getAsString(), "strokeColor"));
            }
            if (asJsonObject2.has("fontSize")) {
                builder.size(asJsonObject2.get("fontSize").getAsInt());
            }
            if (asJsonObject2.has("priority")) {
                PolylineOptions.TextPriority textPriority = PolylineOptions.TextPriority.NORMAL;
                if (asJsonObject2.get("priority").getAsString().equals("high")) {
                    textPriority = PolylineOptions.TextPriority.HIGH;
                }
                builder.priority(textPriority);
            }
        }
        PolylineOptions.Text build = builder.build();
        Object[] objArr2 = {build};
        ChangeQuickRedirect changeQuickRedirect2 = q.a;
        if (PatchProxy.isSupport(objArr2, qVar, changeQuickRedirect2, false, "e181dcf7c44867b55c14c082d230cfee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, qVar, changeQuickRedirect2, false, "e181dcf7c44867b55c14c082d230cfee");
            return;
        }
        qVar.f = build;
        if (qVar.e != null) {
            qVar.e.setText(build);
        }
    }

    private void a(PolylineOptions.MultiColorPattern multiColorPattern, JsonObject jsonObject) {
        Object[] objArr = {multiColorPattern, jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b0f235ad3c85c1df83daae00997bf66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b0f235ad3c85c1df83daae00997bf66");
        } else if (jsonObject.has("borderColors")) {
            JsonArray asJsonArray = jsonObject.get("borderColors").getAsJsonArray();
            int[] iArr = new int[asJsonArray.size()];
            for (int i = 0; i < asJsonArray.size(); i++) {
                iArr[i] = com.meituan.msi.lib.map.utils.a.a(asJsonArray.get(i).getAsString(), "lineBorderColors");
            }
            multiColorPattern.borderColors(iArr);
        }
    }

    public final q a(final JsonObject jsonObject, boolean z) {
        int[] iArr;
        int i = 2;
        int i2 = 0;
        Object[] objArr = {jsonObject, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "285ccc2d3b8074a4fb471977800f6491", RobustBitConfig.DEFAULT_VALUE)) {
            return (q) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "285ccc2d3b8074a4fb471977800f6491");
        }
        final q qVar = this.h ? this.g : new q(this.i);
        qVar.h = jsonObject;
        qVar.i = z;
        if (!jsonObject.has("points") && !this.h) {
            this.b.onError(1201, "no points");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (jsonObject.has("points")) {
            JsonArray asJsonArray = jsonObject.get("points").getAsJsonArray();
            for (int i3 = 0; i3 < asJsonArray.size(); i3++) {
                LatLng b = com.meituan.msi.lib.map.utils.e.b(asJsonArray.get(i3).getAsJsonObject());
                if (b != null) {
                    arrayList.add(b);
                }
            }
            if (arrayList.size() < 2) {
                this.b.onError(1201, "Polyline Point num less than 2");
                return null;
            }
            qVar.a(arrayList);
        }
        char c = 65535;
        if (!this.h) {
            qVar.d = jsonObject.has("id") ? jsonObject.get("id").getAsInt() : -1;
        }
        if (jsonObject.has("width")) {
            qVar.a(com.meituan.msi.util.f.a(jsonObject.get("width").getAsInt()));
        }
        if (jsonObject.has("level")) {
            String asString = jsonObject.get("level").getAsString();
            int hashCode = asString.hashCode();
            if (hashCode != -400236222) {
                if (hashCode == 1906047958 && asString.equals("aboveroads")) {
                    c = 1;
                }
            } else if (asString.equals("abovebuildings")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    i = 1;
                    break;
                case 1:
                    i = 0;
                    break;
            }
            qVar.c = i;
        }
        if (jsonObject.has("zIndex")) {
            qVar.a(jsonObject.get("zIndex").getAsFloat());
        }
        if (jsonObject.has("avoidable")) {
            qVar.a(jsonObject.get("avoidable").getAsBoolean());
        }
        if (jsonObject.has("clickable")) {
            qVar.b(jsonObject.get("clickable").getAsBoolean());
        }
        int a2 = com.meituan.msi.util.f.a(100);
        if (jsonObject.has("spacing")) {
            a2 = com.meituan.msi.util.f.a(jsonObject.get("spacing").getAsInt());
        }
        int i4 = a2;
        String asString2 = jsonObject.has("texturePath") ? jsonObject.get("texturePath").getAsString() : null;
        int a3 = jsonObject.has("color") ? com.meituan.msi.lib.map.utils.a.a(jsonObject.get("color").getAsString(), "lineColor") : PolylineOptions.DEFAULT_BODY_COLOR;
        int i5 = PolylineOptions.DEFAULT_BORDER_COLOR;
        if (jsonObject.has("borderColor")) {
            i5 = com.meituan.msi.lib.map.utils.a.a(jsonObject.get("borderColor").getAsString(), "lineBorderColor");
        }
        int a4 = jsonObject.has("borderWidth") ? com.meituan.msi.util.f.a(jsonObject.get("borderWidth").getAsInt()) : 0;
        String asString3 = jsonObject.has("arrowIconPath") ? jsonObject.get("arrowIconPath").getAsString() : null;
        if (jsonObject.has("lineCap")) {
            qVar.g = jsonObject.get("lineCap").getAsBoolean();
        }
        a(jsonObject, qVar);
        if (jsonObject.has("colorList")) {
            JsonArray asJsonArray2 = jsonObject.get("colorList").getAsJsonArray();
            int[] iArr2 = new int[asJsonArray2.size()];
            for (int i6 = 0; i6 < asJsonArray2.size(); i6++) {
                iArr2[i6] = com.meituan.msi.lib.map.utils.a.a(asJsonArray2.get(i6).getAsString(), "colorList");
            }
            if (jsonObject.has("colorIndex")) {
                JsonArray asJsonArray3 = jsonObject.get("colorIndex").getAsJsonArray();
                iArr = new int[asJsonArray3.size()];
                while (i2 < asJsonArray3.size()) {
                    iArr[i2] = asJsonArray3.get(i2).getAsInt();
                    i2++;
                }
            } else {
                iArr = new int[arrayList.size() - 1];
                while (i2 < arrayList.size() - 1) {
                    iArr[i2] = i2;
                    i2++;
                }
            }
            PolylineOptions.MultiColorPattern borderColor = new PolylineOptions.MultiColorPattern().colors(iArr2, iArr).borderWidth(a4).arrowSpacing(i4).borderColor(i5);
            a(borderColor, jsonObject);
            a(qVar, jsonObject, borderColor, new c.a() { // from class: com.meituan.msi.lib.map.view.model.r.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.lib.map.utils.c.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4207a580b1765fcf8caebc424b073859", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4207a580b1765fcf8caebc424b073859");
                    } else {
                        r.this.a(qVar, jsonObject);
                    }
                }
            });
        } else if (jsonObject.has("dottedLine") && jsonObject.get("dottedLine").getAsBoolean()) {
            a(qVar, i4, a3, asString2, new c.a() { // from class: com.meituan.msi.lib.map.view.model.r.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.lib.map.utils.c.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "00b87d8a51925ad03a8fcc9aff5a89cd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "00b87d8a51925ad03a8fcc9aff5a89cd");
                    } else {
                        r.this.a(qVar, jsonObject);
                    }
                }
            });
        } else {
            PolylineOptions.SingleColorPattern borderWidth = new PolylineOptions.SingleColorPattern().arrowSpacing(i4).color(a3).borderColor(i5).borderWidth(a4);
            if (jsonObject.has("arrowLine") && jsonObject.get("arrowLine").getAsBoolean()) {
                a(qVar, borderWidth, asString3, new c.a() { // from class: com.meituan.msi.lib.map.view.model.r.3
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.msi.lib.map.utils.c.a
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a4ef1f832fa6bbc514db885e16e3621d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a4ef1f832fa6bbc514db885e16e3621d");
                        } else {
                            r.this.a(qVar, jsonObject);
                        }
                    }
                });
            } else {
                qVar.a(borderWidth);
                a(qVar, jsonObject);
            }
        }
        return qVar;
    }

    void a(q qVar, JsonObject jsonObject) {
        Object[] objArr = {qVar, jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a932bd3d8b1af2dfde1cb308f72e7476", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a932bd3d8b1af2dfde1cb308f72e7476");
        } else if (this.h) {
            this.b.onSuccess(null);
        } else {
            qVar.a();
            a(qVar);
            a(qVar, jsonObject, this.b);
        }
    }

    private void a(final q qVar, JsonObject jsonObject, final PolylineOptions.MultiColorPattern multiColorPattern, final c.a aVar) {
        Object[] objArr = {qVar, jsonObject, multiColorPattern, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "462218f3966ae9136e428ff45d340a27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "462218f3966ae9136e428ff45d340a27");
        } else if (jsonObject.has("arrowLine") && jsonObject.get("arrowLine").getAsBoolean()) {
            String asString = jsonObject.has("arrowIconPath") ? jsonObject.get("arrowIconPath").getAsString() : "";
            if (TextUtils.isEmpty(asString)) {
                aVar.a();
            }
            com.meituan.msi.lib.map.utils.c.a(this.b.getActivity()).a(this.b, asString, "multiArrowLine", new Target() { // from class: com.meituan.msi.lib.map.view.model.r.4
                public static ChangeQuickRedirect a;

                @Override // com.squareup.picasso.Target
                public final void onPrepareLoad(Drawable drawable) {
                }

                @Override // com.squareup.picasso.Target
                public final void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
                    Object[] objArr2 = {bitmap, loadedFrom};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4ed6481a70c6d3c98523edcd1e28b1c5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4ed6481a70c6d3c98523edcd1e28b1c5");
                        return;
                    }
                    multiColorPattern.arrowTexture(BitmapDescriptorFactory.fromBitmap(bitmap));
                    qVar.a(multiColorPattern);
                    aVar.a();
                }

                @Override // com.squareup.picasso.Target
                public final void onBitmapFailed(Drawable drawable) {
                    Object[] objArr2 = {drawable};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c1b48f6ac25cd0c87e10d68877c7fd8d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c1b48f6ac25cd0c87e10d68877c7fd8d");
                        return;
                    }
                    qVar.a(multiColorPattern);
                    aVar.a();
                }
            });
        } else {
            qVar.a(multiColorPattern);
            aVar.a();
        }
    }

    private void a(final q qVar, final int i, final int i2, String str, final c.a aVar) {
        Object[] objArr = {qVar, Integer.valueOf(i), Integer.valueOf(i2), str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92a26ce04fe33dbfc006355b7d0bb73a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92a26ce04fe33dbfc006355b7d0bb73a");
        } else if (!TextUtils.isEmpty(str)) {
            com.meituan.msi.lib.map.utils.c.a(this.b.getActivity()).a(this.b, str, "dotLine", new Target() { // from class: com.meituan.msi.lib.map.view.model.r.5
                public static ChangeQuickRedirect a;

                @Override // com.squareup.picasso.Target
                public final void onPrepareLoad(Drawable drawable) {
                }

                @Override // com.squareup.picasso.Target
                public final void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
                    Object[] objArr2 = {bitmap, loadedFrom};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "824db3318b04984c860551234e8d6754", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "824db3318b04984c860551234e8d6754");
                        return;
                    }
                    PolylineOptions.DotLinePattern spacing = new PolylineOptions.DotLinePattern().spacing(i);
                    spacing.texture(BitmapDescriptorFactory.fromBitmap(bitmap));
                    qVar.a(spacing);
                    if (aVar != null) {
                        aVar.a();
                    }
                }

                @Override // com.squareup.picasso.Target
                public final void onBitmapFailed(Drawable drawable) {
                    Object[] objArr2 = {drawable};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "70f649ab43636a75feae5be4d79acf40", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "70f649ab43636a75feae5be4d79acf40");
                        return;
                    }
                    qVar.a(new PolylineOptions.DotColorLinePattern().color(i2));
                    if (aVar != null) {
                        aVar.a();
                    }
                    r.this.b.onError(1201, "texture load fail");
                }
            });
        } else {
            qVar.a(new PolylineOptions.DotColorLinePattern().color(i2));
            aVar.a();
            this.b.onError(1201, "texturePath is null");
        }
    }

    private void a(final q qVar, final PolylineOptions.SingleColorPattern singleColorPattern, String str, final c.a aVar) {
        Object[] objArr = {qVar, singleColorPattern, str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "238527ad3ae5166570bde05f274e0321", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "238527ad3ae5166570bde05f274e0321");
        } else if (!TextUtils.isEmpty(str)) {
            com.meituan.msi.lib.map.utils.c.a(this.b.getActivity()).a(this.b, str, "singleArrowLine", new Target() { // from class: com.meituan.msi.lib.map.view.model.r.6
                public static ChangeQuickRedirect a;

                @Override // com.squareup.picasso.Target
                public final void onPrepareLoad(Drawable drawable) {
                }

                @Override // com.squareup.picasso.Target
                public final void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
                    Object[] objArr2 = {bitmap, loadedFrom};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a91e96124dccfb924c6240ec2982aa19", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a91e96124dccfb924c6240ec2982aa19");
                        return;
                    }
                    singleColorPattern.arrowTexture(BitmapDescriptorFactory.fromBitmap(bitmap));
                    qVar.a(singleColorPattern);
                    if (aVar != null) {
                        aVar.a();
                    }
                }

                @Override // com.squareup.picasso.Target
                public final void onBitmapFailed(Drawable drawable) {
                    Object[] objArr2 = {drawable};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7f3ab38a8b02c55cd402abc78047a6d1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7f3ab38a8b02c55cd402abc78047a6d1");
                        return;
                    }
                    qVar.a(singleColorPattern);
                    if (aVar != null) {
                        aVar.a();
                    }
                    r.this.b.onError(1201, "arrowTexture load fail");
                }
            });
        } else {
            qVar.a(singleColorPattern);
            aVar.a();
            this.b.onError(1201, "arrowTexture is null");
        }
    }

    private void a(final q qVar, JsonObject jsonObject, final MsiContext msiContext) {
        Object[] objArr = {qVar, jsonObject, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23ebd5e33e75e4ecadf481b4ad9de5c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23ebd5e33e75e4ecadf481b4ad9de5c6");
        } else if (jsonObject.has("animate") && jsonObject.get("animate").getAsBoolean() && qVar.i) {
            EmergeAnimation emergeAnimation = new EmergeAnimation(qVar.b.get(0));
            emergeAnimation.setDuration(jsonObject.has("duration") ? jsonObject.get("duration").getAsLong() : 1000L);
            Interpolator linearInterpolator = new LinearInterpolator();
            if (jsonObject.has(RecceAnimUtils.INTERPOLATOR)) {
                switch (jsonObject.get(RecceAnimUtils.INTERPOLATOR).getAsInt()) {
                    case 1:
                        linearInterpolator = new AccelerateInterpolator();
                        break;
                    case 2:
                        linearInterpolator = new DecelerateInterpolator();
                        break;
                    default:
                        linearInterpolator = new LinearInterpolator();
                        break;
                }
            }
            emergeAnimation.setInterpolator(linearInterpolator);
            emergeAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.meituan.msi.lib.map.view.model.r.7
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mapsdk.maps.model.animation.Animation.AnimationListener
                public final void onAnimationStart() {
                }

                @Override // com.sankuai.meituan.mapsdk.maps.model.animation.Animation.AnimationListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                }

                @Override // com.sankuai.meituan.mapsdk.maps.model.animation.Animation.AnimationListener
                public final void onAnimationEnd() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7b242eacf82e2b77e5fcddbf10b05fd8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7b242eacf82e2b77e5fcddbf10b05fd8");
                    } else if (r.this.d != null) {
                        msiContext.onSuccess(null);
                        r.this.d.a(qVar.d);
                    }
                }

                @Override // com.sankuai.meituan.mapsdk.maps.model.animation.Animation.AnimationListener
                public final void onAnimationCancel(Animator animator) {
                    Object[] objArr2 = {animator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "082dd3f900b41c505ed131cf4e762596", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "082dd3f900b41c505ed131cf4e762596");
                        return;
                    }
                    MsiContext msiContext2 = msiContext;
                    msiContext2.onError(1201, "msiPolyline id = " + qVar.d + " onAnimationCancel");
                }
            });
            qVar.e.startAnimation(emergeAnimation, qVar.b.get(0));
        }
    }

    private void a(JsonObject jsonObject) {
        boolean z;
        JsonArray asJsonArray;
        Object[] objArr = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0c9c599ed37c28cea7b376783855937", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0c9c599ed37c28cea7b376783855937");
            return;
        }
        if (!jsonObject.has("ids") || (asJsonArray = jsonObject.get("ids").getAsJsonArray()) == null) {
            z = false;
        } else {
            int size = asJsonArray.size();
            z = false;
            for (int i = 0; i < size; i++) {
                int asInt = asJsonArray.get(i).getAsInt();
                for (q qVar : new ArrayList(this.c)) {
                    if (qVar.d == asInt) {
                        qVar.b();
                        this.c.remove(qVar);
                        z = true;
                    }
                }
            }
        }
        if (z) {
            this.b.onSuccess(null);
        } else {
            this.b.onError(1201, "no id or id not existed");
        }
    }

    private void a(q qVar) {
        Object[] objArr = {qVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a31154b42f57b6b2a771709ded03214", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a31154b42f57b6b2a771709ded03214");
        } else if (qVar.e == null) {
            this.b.onError(1201, "Polyline is null, MapSDK Error");
        } else if (qVar.i) {
            this.e.add(qVar);
        } else {
            this.c.add(qVar);
        }
    }
}
