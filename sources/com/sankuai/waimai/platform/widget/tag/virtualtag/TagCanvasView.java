package com.sankuai.waimai.platform.widget.tag.virtualtag;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.platform.widget.tag.virtualview.CanvasView;
import com.sankuai.waimai.platform.widget.tag.virtualview.b;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class TagCanvasView extends CanvasView<b, com.sankuai.waimai.platform.widget.tag.virtualtag.a<?>> {
    public static ChangeQuickRedirect b;
    private int a;
    private int d;
    private int e;
    private boolean f;
    private a g;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b extends CanvasView.d {
        public int a;
        public int b;
        public int c;
        boolean d;
    }

    @Override // com.sankuai.waimai.platform.widget.tag.virtualview.CanvasView
    public final /* synthetic */ void a(b bVar) {
        b bVar2 = bVar;
        Object[] objArr = {bVar2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cf3de9adc0502cb5865922b0efd58d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cf3de9adc0502cb5865922b0efd58d8");
            return;
        }
        super.a((TagCanvasView) bVar2);
        bVar2.a = this.a;
        bVar2.b = this.d;
        bVar2.c = this.e;
        bVar2.d = this.f;
    }

    @Override // com.sankuai.waimai.platform.widget.tag.virtualview.CanvasView
    public final /* synthetic */ b b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb325f9bebaf14fdf238b9060ebf075c", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb325f9bebaf14fdf238b9060ebf075c") : new b();
    }

    public TagCanvasView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2402557b44b7b3cdb33f3bc48751d3c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2402557b44b7b3cdb33f3bc48751d3c");
        }
    }

    public TagCanvasView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42576184b7f1d8ac6bf451c1beb25271", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42576184b7f1d8ac6bf451c1beb25271");
        }
    }

    public TagCanvasView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cec7e68165aca55b97d9fd5ea3d34bb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cec7e68165aca55b97d9fd5ea3d34bb");
            return;
        }
        setImportantForAccessibility(1);
        Object[] objArr2 = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "753a41cbf29a32e2d19b024661c0912f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "753a41cbf29a32e2d19b024661c0912f");
        } else {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.max_line, R.attr.line_space, R.attr.tag_space, R.attr.with_ellipsize}, i, 0);
            this.a = obtainStyledAttributes.getInteger(0, Integer.MAX_VALUE);
            this.d = obtainStyledAttributes.getDimensionPixelSize(1, com.sankuai.waimai.platform.widget.tag.util.b.a(context, 5.0f));
            this.e = obtainStyledAttributes.getDimensionPixelSize(2, com.sankuai.waimai.platform.widget.tag.util.b.a(context, 5.0f));
            this.f = obtainStyledAttributes.getBoolean(3, true);
            obtainStyledAttributes.recycle();
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = b;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1881d1f25d0533b08d8844ec65398b08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1881d1f25d0533b08d8844ec65398b08");
            return;
        }
        com.sankuai.waimai.platform.widget.tag.virtualview.b bVar = new com.sankuai.waimai.platform.widget.tag.virtualview.b() { // from class: com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.tag.virtualview.b
            public final void a(final String str, int i2, int i3, final b.a aVar) {
                Object[] objArr4 = {str, Integer.valueOf(i2), Integer.valueOf(i3), aVar};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "afe6467fc2980b52d5114d4dbe2300e1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "afe6467fc2980b52d5114d4dbe2300e1");
                    return;
                }
                b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a2.b = TagCanvasView.this.getContext();
                a2.c = str;
                a2.a(i2, i3).a(new b.a() { // from class: com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView.1.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mtimageloader.config.b.a
                    public final void a() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "912a57640d1409e90e67df661fe87261", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "912a57640d1409e90e67df661fe87261");
                        }
                    }

                    @Override // com.sankuai.meituan.mtimageloader.config.b.a
                    public final void a(Bitmap bitmap) {
                        Object[] objArr5 = {bitmap};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "7e686a7c18e4311ad6362aa03ffbc734", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "7e686a7c18e4311ad6362aa03ffbc734");
                        } else if (bitmap == null || aVar == null) {
                        } else {
                            aVar.a(bitmap, str);
                        }
                    }
                });
            }

            @Override // com.sankuai.waimai.platform.widget.tag.virtualview.b
            public final Drawable a(int i2, int i3, int i4) {
                Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "86657c0aa691bb5ddeb0352ba24c6eb9", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Drawable) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "86657c0aa691bb5ddeb0352ba24c6eb9");
                }
                try {
                    return TagCanvasView.this.getResources().getDrawable(i2, TagCanvasView.this.getContext().getTheme());
                } catch (Resources.NotFoundException e) {
                    com.sankuai.waimai.foundation.utils.log.a.b(e);
                    return null;
                }
            }
        };
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = CanvasView.e.a;
        CanvasView.e.a aVar = PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "d1b7a53b37db1fc41d9677ab85e7f159", RobustBitConfig.DEFAULT_VALUE) ? (CanvasView.e.a) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "d1b7a53b37db1fc41d9677ab85e7f159") : new CanvasView.e.a();
        aVar.b = bVar;
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = CanvasView.e.a.a;
        setSettings(PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "ee82623b648ae6768b4406000a63611b", RobustBitConfig.DEFAULT_VALUE) ? (CanvasView.e) PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "ee82623b648ae6768b4406000a63611b") : new CanvasView.e(aVar));
    }

    @Override // com.sankuai.waimai.platform.widget.tag.virtualview.CanvasView, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ba988bcc31f293f66c4879b7b4fb783", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ba988bcc31f293f66c4879b7b4fb783");
            return;
        }
        super.onMeasure(i, i2);
        if (this.g != null) {
            this.g.a();
        }
    }

    @Override // com.sankuai.waimai.platform.widget.tag.virtualview.CanvasView
    public final void a() {
        String str;
        com.sankuai.waimai.platform.widget.tag.virtualview.render.h hVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa56e6a4337942ce98ae243c316d2d8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa56e6a4337942ce98ae243c316d2d8c");
            return;
        }
        super.a();
        com.sankuai.waimai.platform.widget.tag.virtualtag.a<?> adapter = getAdapter();
        if (adapter != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.platform.widget.tag.virtualtag.a.a;
            if (PatchProxy.isSupport(objArr2, adapter, changeQuickRedirect2, false, "c0079fb9463dc8654dbc39c8349e7ed9", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr2, adapter, changeQuickRedirect2, false, "c0079fb9463dc8654dbc39c8349e7ed9");
            } else {
                List<j> b2 = adapter.b();
                if (b2 == null || b2.isEmpty()) {
                    str = "";
                } else {
                    StringBuilder sb = new StringBuilder();
                    for (j jVar : b2) {
                        for (d dVar : jVar.d()) {
                            for (i<?> iVar : dVar.d()) {
                                if (iVar.h >= 0) {
                                    if (iVar instanceof e) {
                                        com.sankuai.waimai.platform.widget.tag.virtualview.render.e eVar = (com.sankuai.waimai.platform.widget.tag.virtualview.render.e) ((e) iVar).k;
                                        if (eVar != null) {
                                            if (!TextUtils.isEmpty(eVar.g)) {
                                                sb.append("[");
                                                sb.append(eVar.g);
                                                sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                                            } else {
                                                sb.append("[");
                                                sb.append(eVar.f);
                                                sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                                            }
                                        }
                                    } else if ((iVar instanceof h) && (hVar = (com.sankuai.waimai.platform.widget.tag.virtualview.render.h) ((h) iVar).k) != null) {
                                        if (!TextUtils.isEmpty(hVar.g)) {
                                            sb.append("[");
                                            sb.append(hVar.g);
                                            sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                                        } else {
                                            sb.append("[");
                                            sb.append(hVar.f);
                                            sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    str = sb.toString();
                }
            }
            if (!TextUtils.isEmpty(str)) {
                setContentDescription(str);
            }
            adapter.a();
        }
    }

    public void setCallback(a aVar) {
        this.g = aVar;
    }

    public void setMaxLines(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8399ee9312e2888f8e04d9bd26b9d982", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8399ee9312e2888f8e04d9bd26b9d982");
            return;
        }
        boolean z = this.a != i;
        this.a = i;
        a(z);
    }

    public void setTagSpace(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99359037b727054bfe28e34840a69859", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99359037b727054bfe28e34840a69859");
            return;
        }
        boolean z = this.e != i;
        this.e = i;
        a(z);
    }

    public void setLineSpace(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3991aedf8c07356975f88e007072d6a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3991aedf8c07356975f88e007072d6a7");
            return;
        }
        boolean z = this.d != i;
        this.d = i;
        a(z);
    }

    public int getMaxLines() {
        return this.a;
    }

    public int getLineSpace() {
        return this.d;
    }

    public int getTagSpace() {
        return this.e;
    }
}
