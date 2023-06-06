package com.dianping.gcmrnmodule.components.textview;

import android.support.v4.util.Pools;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.richtext.BaseRichTextView;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.titans.widget.DynamicTitleParser;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.UIViewOperationQueue;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.text.ReactBaseTextShadowNode;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.d;
import com.meituan.android.recce.props.gens.NumberOfLines;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class MRNModuleTextViewShadowNode extends LayoutShadowNode {
    public static ChangeQuickRedirect a;
    protected static Pools.SynchronizedPool<BaseRichTextView> b = new Pools.SynchronizedPool<>(5);
    protected a c;

    public MRNModuleTextViewShadowNode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aad138731fe18f0e295de41fc8063164", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aad138731fe18f0e295de41fc8063164");
        } else {
            setMeasureFunction(new YogaMeasureFunction() { // from class: com.dianping.gcmrnmodule.components.textview.MRNModuleTextViewShadowNode.1
                public static ChangeQuickRedirect a;

                @Override // com.facebook.yoga.YogaMeasureFunction
                public final long measure(d dVar, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
                    Object[] objArr2 = {dVar, Float.valueOf(f), yogaMeasureMode, Float.valueOf(f2), yogaMeasureMode2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c27d856b5413d4c29550e4b846d1b825", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c27d856b5413d4c29550e4b846d1b825")).longValue();
                    }
                    if (MRNModuleTextViewShadowNode.this.c != null) {
                        BaseRichTextView acquire = MRNModuleTextViewShadowNode.b.acquire();
                        if (acquire == null) {
                            acquire = new BaseRichTextView(MRNModuleTextViewShadowNode.this.getThemedContext().getApplicationContext());
                            acquire.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        }
                        int i = (int) f;
                        int i2 = (int) f2;
                        MRNModuleTextViewShadowNode.this.a(i, i2);
                        MRNModuleTextViewShadowNode.this.c.a(MRNModuleTextViewShadowNode.this.getThemedContext().getApplicationContext());
                        c.a(acquire, MRNModuleTextViewShadowNode.this.c);
                        acquire.measure(View.MeasureSpec.makeMeasureSpec(i, yogaMeasureMode.d << 30), View.MeasureSpec.makeMeasureSpec(i2, yogaMeasureMode2.d << 30));
                        long a2 = com.facebook.yoga.c.a(acquire.getMeasuredWidth(), acquire.getMeasuredHeight());
                        MRNModuleTextViewShadowNode.b.release(acquire);
                        return a2;
                    }
                    return 0L;
                }
            });
        }
    }

    @ReactProp(name = "labelModel")
    public void setLabelModel(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ab25a0d5ab92f9557584146583f98e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ab25a0d5ab92f9557584146583f98e3");
            return;
        }
        if (this.c == null) {
            this.c = new a();
        }
        a aVar = this.c;
        Object[] objArr2 = {aVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "83b0ca2faf4cdd8032f5415811551762", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "83b0ca2faf4cdd8032f5415811551762");
        } else if (readableMap != null) {
            if (readableMap.hasKey("text")) {
                aVar.b = readableMap.getString("text");
            }
            if (readableMap.hasKey("textColor")) {
                aVar.e = com.dianping.gcmrnmodule.utils.b.a(Integer.valueOf(readableMap.getInt("textColor")));
            }
            if (readableMap.hasKey(DMKeys.KEY_TAB_TEXT_SIZE)) {
                aVar.d = readableMap.getInt(DMKeys.KEY_TAB_TEXT_SIZE);
            }
            if (readableMap.hasKey("fontName")) {
                aVar.h = readableMap.getString("fontName");
            }
            if (readableMap.hasKey("fontStyle")) {
                aVar.n = readableMap.getInt("fontStyle");
            }
            if (readableMap.hasKey("textAlignment")) {
                aVar.j = readableMap.getInt("textAlignment");
            }
            if (readableMap.hasKey("contentVerticalAlignment")) {
                aVar.k = readableMap.getInt("contentVerticalAlignment");
            }
            if (readableMap.hasKey("lineBreakMode")) {
                aVar.l = readableMap.getInt("lineBreakMode");
            }
            if (readableMap.hasKey(NumberOfLines.LOWER_CASE_NAME)) {
                aVar.m = readableMap.getInt(NumberOfLines.LOWER_CASE_NAME);
            }
            if (readableMap.hasKey("linespacing")) {
                aVar.o = readableMap.getInt("linespacing");
            }
            if (readableMap.hasKey("strikethrough")) {
                aVar.q = readableMap.getBoolean("strikethrough");
            }
            if (readableMap.hasKey(DynamicTitleParser.PARSER_VAL_FONT_STYLE_UNDERLINE)) {
                aVar.p = readableMap.getBoolean(DynamicTitleParser.PARSER_VAL_FONT_STYLE_UNDERLINE);
            }
            if (readableMap.hasKey("disableBold")) {
                aVar.v = readableMap.getBoolean("disableBold");
            }
            if (readableMap.hasKey(ReactBaseTextShadowNode.PROP_SHADOW_OFFSET)) {
                ReadableMap map = readableMap.getMap(ReactBaseTextShadowNode.PROP_SHADOW_OFFSET);
                if (map.hasKey("width")) {
                    aVar.s = map.getInt("width");
                }
                if (map.hasKey("height")) {
                    aVar.t = map.getInt("height");
                }
            }
            if (readableMap.hasKey("textShadowColor")) {
                aVar.r = com.dianping.gcmrnmodule.utils.b.a(Integer.valueOf(readableMap.getInt("textShadowColor")));
            }
            if (readableMap.hasKey("textShadowRadius")) {
                aVar.u = readableMap.getInt("textShadowRadius");
            }
            if (readableMap.hasKey("adjustsFitWidth")) {
                aVar.w = readableMap.getBoolean("adjustsFitWidth");
            }
        }
        markUpdated();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl
    public void markUpdated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9be3f96c0998127b5e1c50e8249e9373", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9be3f96c0998127b5e1c50e8249e9373");
            return;
        }
        super.markUpdated();
        super.dirty();
    }

    public final void a(int i, int i2) {
        this.c.x = i;
        this.c.y = i2;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.af
    public void onCollectExtraUpdates(UIViewOperationQueue uIViewOperationQueue) {
        Object[] objArr = {uIViewOperationQueue};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42ff3a665d71ccb09d9f8760ef937236", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42ff3a665d71ccb09d9f8760ef937236");
            return;
        }
        super.onCollectExtraUpdates(uIViewOperationQueue);
        uIViewOperationQueue.a(getReactTag(), this.c);
    }
}
