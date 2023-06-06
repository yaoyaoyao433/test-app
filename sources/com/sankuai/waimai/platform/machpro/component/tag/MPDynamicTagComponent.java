package com.sankuai.waimai.platform.machpro.component.tag;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewTreeObserver;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.text.SizeSpec;
import com.sankuai.waimai.machpro.base.MachArray;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.component.MPComponent;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.platform.mach.tag.b;
import com.sankuai.waimai.platform.mach.tag.c;
import com.sankuai.waimai.platform.widget.tag.api.d;
import com.sankuai.waimai.platform.widget.tag.util.a;
import com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView;
import com.sankuai.waimai.platform.widget.tag.virtualtag.g;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MPDynamicTagComponent extends MPComponent<b> implements YogaMeasureFunction {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    private List<d> d;
    private int e;
    private int f;
    private int g;
    private c h;
    private g i;
    private boolean j;

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public /* synthetic */ b createView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d25b2420a98935c7327d51f8b9fc2f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d25b2420a98935c7327d51f8b9fc2f9");
        }
        b bVar = new b(this.mMachContext.getContext());
        bVar.a(this.b, this.c);
        bVar.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.sankuai.waimai.platform.machpro.component.tag.MPDynamicTagComponent.1
            public static ChangeQuickRedirect a;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b8865167694cba174522b2c3f6b4e1de", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b8865167694cba174522b2c3f6b4e1de");
                    return;
                }
                if (MPDynamicTagComponent.this.j) {
                    MPDynamicTagComponent.b(MPDynamicTagComponent.this);
                }
                MPDynamicTagComponent.c(MPDynamicTagComponent.this);
            }
        });
        return bVar;
    }

    public static /* synthetic */ void b(MPDynamicTagComponent mPDynamicTagComponent) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mPDynamicTagComponent, changeQuickRedirect, false, "47a6fa9e953bde29387dc0b53bca2579", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mPDynamicTagComponent, changeQuickRedirect, false, "47a6fa9e953bde29387dc0b53bca2579");
            return;
        }
        mPDynamicTagComponent.j = false;
        b view = mPDynamicTagComponent.getView();
        view.a(mPDynamicTagComponent.b, mPDynamicTagComponent.c);
        view.setMaxLines(mPDynamicTagComponent.e);
        view.setTagSpace(mPDynamicTagComponent.f);
        view.setLineSpace(mPDynamicTagComponent.g);
        view.setAdapter(mPDynamicTagComponent.i);
    }

    public static /* synthetic */ void c(MPDynamicTagComponent mPDynamicTagComponent) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mPDynamicTagComponent, changeQuickRedirect, false, "6a9bca2186096dab60953a936cf972b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mPDynamicTagComponent, changeQuickRedirect, false, "6a9bca2186096dab60953a936cf972b8");
            return;
        }
        MachMap machMap = new MachMap();
        int i = 1;
        if (mPDynamicTagComponent.e > 1 || (mPDynamicTagComponent.e == 1 && mPDynamicTagComponent.i != null && mPDynamicTagComponent.i.d)) {
            i = 2;
        }
        machMap.put("totalLines", Integer.valueOf(i));
        MachArray machArray = new MachArray();
        machArray.add(machMap);
        mPDynamicTagComponent.dispatchEvent("finishLayout", machArray);
    }

    public MPDynamicTagComponent(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0bde925f8bae72191ce560a871bdcc0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0bde925f8bae72191ce560a871bdcc0");
            return;
        }
        this.d = new ArrayList();
        this.e = 1;
        this.j = true;
        this.g = com.sankuai.waimai.foundation.utils.g.a(this.mMachContext.getContext(), 4.0f);
        this.f = com.sankuai.waimai.foundation.utils.g.a(this.mMachContext.getContext(), 4.0f);
        getYogaNode().a((YogaMeasureFunction) this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
        if (r14.equals("lineSpacing") != false) goto L14;
     */
    @Override // com.sankuai.waimai.machpro.component.MPComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void updateAttribute(java.lang.String r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.machpro.component.tag.MPDynamicTagComponent.updateAttribute(java.lang.String, java.lang.Object):void");
    }

    private boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b146b9f48b39f5ba14a49caf97dd3a98", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b146b9f48b39f5ba14a49caf97dd3a98")).booleanValue() : !TextUtils.isEmpty(str);
    }

    @Override // com.facebook.yoga.YogaMeasureFunction
    public long measure(com.facebook.yoga.d dVar, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        Object[] objArr = {dVar, Float.valueOf(f), yogaMeasureMode, Float.valueOf(f2), yogaMeasureMode2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d165f5a2f2873b6c55734ae2c0312be7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d165f5a2f2873b6c55734ae2c0312be7")).longValue();
        }
        Context context = this.mMachContext.getContext();
        TagCanvasView tagCanvasView = new TagCanvasView(context);
        this.i = new g(context, a.a(context, this.d, this.h));
        tagCanvasView.setAdapter(this.i);
        tagCanvasView.setMaxLines(this.e);
        tagCanvasView.setTagSpace(this.f);
        tagCanvasView.setLineSpace(this.g);
        tagCanvasView.setPadding((int) dVar.c(YogaEdge.LEFT).d, (int) dVar.c(YogaEdge.TOP).d, (int) dVar.c(YogaEdge.RIGHT).d, (int) dVar.c(YogaEdge.BOTTOM).d);
        int a2 = SizeSpec.a(f, yogaMeasureMode);
        int a3 = SizeSpec.a(f2, yogaMeasureMode2);
        tagCanvasView.measure(a2, a3);
        this.b = a2;
        this.c = a3;
        int measuredWidth = tagCanvasView.getMeasuredWidth();
        int measuredHeight = tagCanvasView.getMeasuredHeight();
        tagCanvasView.setAdapter(null);
        return com.facebook.yoga.c.a(measuredWidth, measuredHeight);
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void onAppendChild(MPComponent mPComponent, MPComponent mPComponent2) {
        Object[] objArr = {mPComponent, mPComponent2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "381fb9dd694ff2b7d150da5adec4f3b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "381fb9dd694ff2b7d150da5adec4f3b9");
        } else {
            super.onAppendChild(mPComponent, mPComponent2);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class MachMapSerializer implements JsonSerializer<MachMap> {
        public static ChangeQuickRedirect a;

        public MachMapSerializer() {
        }

        @Override // com.google.gson.JsonSerializer
        public /* synthetic */ JsonElement serialize(MachMap machMap, Type type, JsonSerializationContext jsonSerializationContext) {
            MachMap machMap2 = machMap;
            Object[] objArr = {machMap2, type, jsonSerializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e337e1bbdbcf59d6ed881b59b3f9068c", RobustBitConfig.DEFAULT_VALUE) ? (JsonElement) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e337e1bbdbcf59d6ed881b59b3f9068c") : jsonSerializationContext.serialize(machMap2.getJavaMap());
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class MachArraySerializer implements JsonSerializer<MachArray> {
        public static ChangeQuickRedirect a;

        public MachArraySerializer() {
        }

        @Override // com.google.gson.JsonSerializer
        public /* synthetic */ JsonElement serialize(MachArray machArray, Type type, JsonSerializationContext jsonSerializationContext) {
            MachArray machArray2 = machArray;
            Object[] objArr = {machArray2, type, jsonSerializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "929c7507c7e81115c167a6ad4c69dc25", RobustBitConfig.DEFAULT_VALUE) ? (JsonElement) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "929c7507c7e81115c167a6ad4c69dc25") : jsonSerializationContext.serialize(machArray2.toArray());
        }
    }
}
