package com.sankuai.waimai.machpro.component.text;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.facebook.yoga.YogaEdge;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MPTextView extends AppCompatTextView {
    public static ChangeQuickRedirect a;
    private WeakReference<e> b;
    private String c;
    private com.sankuai.waimai.machpro.view.decoration.d d;

    public MPTextView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75261a0d30b2f0a3d6f15802244fc3c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75261a0d30b2f0a3d6f15802244fc3c7");
        }
    }

    public MPTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a528cd62e86390e97b0609fb4b96c42", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a528cd62e86390e97b0609fb4b96c42");
        }
    }

    public final void a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33254b7ce6f88ac3afa01c405b83660f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33254b7ce6f88ac3afa01c405b83660f");
        } else {
            this.b = new WeakReference<>(eVar);
        }
    }

    public e getComponent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3ac0aac4279745243205be143805709", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3ac0aac4279745243205be143805709");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.get();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ff640d65e3276e4b818d74bb58a8b4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ff640d65e3276e4b818d74bb58a8b4c");
            return;
        }
        Object[] objArr2 = {canvas};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "346b1b1d279b5a08e8665a37ecb0c63d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "346b1b1d279b5a08e8665a37ecb0c63d");
        } else {
            e component = getComponent();
            if (component != null) {
                String boxShadow = component.getBoxShadow();
                if (TextUtils.isEmpty(boxShadow)) {
                    this.c = "";
                } else {
                    if (!boxShadow.equals(this.c)) {
                        this.c = boxShadow;
                        String[] split = this.c.split("\\s+");
                        if (split.length == 4) {
                            this.d = new com.sankuai.waimai.machpro.view.decoration.d(split);
                        }
                    }
                    if (this.d != null) {
                        this.d.a(getWidth(), getHeight());
                        this.d.a(component.getBorderRadii());
                        this.d.a(canvas);
                    }
                }
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f97e5b95bf93133cc712a8cb5e449d0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f97e5b95bf93133cc712a8cb5e449d0d");
            return;
        }
        setPadding(0, 0, 0, 0);
        super.onMeasure(i, i2);
    }

    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec0690eb6c16d234f1ed7895da9792d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec0690eb6c16d234f1ed7895da9792d4");
            return;
        }
        com.facebook.yoga.d yogaNode = this.b != null ? this.b.get().getYogaNode() : null;
        if (yogaNode != null) {
            setPadding((int) yogaNode.f(YogaEdge.LEFT), (int) yogaNode.f(YogaEdge.TOP), (int) yogaNode.f(YogaEdge.RIGHT), (int) yogaNode.f(YogaEdge.BOTTOM));
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c585170a1d7610d8f73e594058bc10d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c585170a1d7610d8f73e594058bc10d2");
        } else {
            super.onDraw(canvas);
        }
    }
}
