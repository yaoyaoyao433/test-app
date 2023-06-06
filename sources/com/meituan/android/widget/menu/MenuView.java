package com.meituan.android.widget.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MenuView extends View {
    public static ChangeQuickRedirect a;
    private List<b> b;
    private Paint c;
    private Paint d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;

    public MenuView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8905c7b36c8c68b863863409b7b1abf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8905c7b36c8c68b863863409b7b1abf");
        }
    }

    private MenuView(Context context, AttributeSet attributeSet) {
        this(context, null, R.attr.mtMenuViewStyle);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42d63d12c33efccc6cbe1a86d5506f87", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42d63d12c33efccc6cbe1a86d5506f87");
        }
    }

    public MenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3079a3935c317e6df620bfb788ac900", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3079a3935c317e6df620bfb788ac900");
            return;
        }
        Resources resources = context.getResources();
        float dimension = resources.getDimension(R.dimen.commonui_menu_view_text_size);
        int color = resources.getColor(R.color.commonui_menu_view_title_color);
        int color2 = resources.getColor(R.color.commonui_menu_view_content_color);
        float dimension2 = resources.getDimension(R.dimen.commonui_menu_view_sep_padding);
        float dimension3 = resources.getDimension(R.dimen.commonui_menu_view_title_padding);
        float dimension4 = resources.getDimension(R.dimen.commonui_menu_view_content_padding);
        float dimension5 = resources.getDimension(R.dimen.commonui_menu_view_price_padding);
        float dimension6 = resources.getDimension(R.dimen.commonui_menu_view_line_spacing);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842926, 16843052, 16843053, 16843054, 16843055, 16843056, 16843057, R.attr.titleSize, R.attr.titleColor, R.attr.contentSize, R.attr.contentColor, R.attr.sepPadding, R.attr.menuTitlePadding, R.attr.contentPaddingMenuView, R.attr.pricePadding, R.attr.lineSpacing, R.attr.preserveIconSpacing, R.attr.subMenuArrow}, i, 0);
        this.e = obtainStyledAttributes.getDimension(11, dimension2);
        this.f = obtainStyledAttributes.getDimension(12, dimension3);
        this.g = obtainStyledAttributes.getDimension(13, dimension4);
        this.h = obtainStyledAttributes.getDimension(14, dimension5);
        this.i = obtainStyledAttributes.getDimension(15, dimension6);
        this.c = new Paint();
        this.c.setAntiAlias(true);
        this.c.setTextSize(obtainStyledAttributes.getDimension(7, dimension));
        this.c.setColor(obtainStyledAttributes.getColor(8, color));
        this.d = new Paint();
        this.d.setAntiAlias(true);
        this.d.setTextSize(obtainStyledAttributes.getDimension(9, dimension));
        this.d.setColor(obtainStyledAttributes.getColor(10, color2));
        obtainStyledAttributes.recycle();
    }

    public void setMenuItems(List<b> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2794802637e3e82050fc6374fb5f1ca1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2794802637e3e82050fc6374fb5f1ca1");
        } else if (list == null) {
        } else {
            this.b = list;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01a506d711028342e702f25e1fdbd8f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01a506d711028342e702f25e1fdbd8f8");
        } else if (this.b == null) {
            setMeasuredDimension(0, 0);
        } else {
            int size = View.MeasureSpec.getSize(i);
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            float f = paddingTop + 0.0f;
            for (int i3 = 0; i3 < this.b.size(); i3++) {
                b bVar = this.b.get(i3);
                if (bVar instanceof c) {
                    f += this.e;
                } else if (bVar instanceof d) {
                    float a2 = f + a(((d) bVar).a, (size - paddingLeft) - paddingRight, this.c);
                    if (i3 == 0 || i3 == this.b.size() - 1) {
                        f = a2 + this.f;
                    } else {
                        f = a2 + (this.f * 2.0f);
                    }
                } else if (bVar instanceof a) {
                    a aVar = (a) bVar;
                    float a3 = f + a(aVar.a, (((size - paddingLeft) - this.h) - this.d.measureText(aVar.b)) - paddingRight, this.d);
                    if (i3 == 0 || i3 == this.b.size() - 1) {
                        f = a3 + this.g;
                    } else {
                        f = a3 + (this.g * 2.0f);
                    }
                }
            }
            setMeasuredDimension(size, (int) (f + paddingBottom));
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ac82365036134a3997bc6495941531d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ac82365036134a3997bc6495941531d");
            return;
        }
        super.onDraw(canvas);
        if (this.b == null) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        float paddingTop = getPaddingTop();
        int i = 0;
        while (i < this.b.size()) {
            b bVar = this.b.get(i);
            if (bVar instanceof c) {
                paddingTop += this.e;
            } else if (bVar instanceof d) {
                List<String> b = b(((d) bVar).a, (measuredWidth - paddingLeft) - paddingRight, this.c);
                f = i > 0 ? 0.0f + this.f : 0.0f;
                int size = b.size();
                float f2 = f;
                for (int i2 = 0; i2 < size; i2++) {
                    canvas.drawText(b.get(i2), paddingLeft, (paddingTop - this.c.ascent()) + f2, this.c);
                    f2 += this.c.descent() - this.c.ascent();
                    if (i2 < size - 1) {
                        f2 += this.i;
                    }
                }
                paddingTop += f2;
                if (i < this.b.size() - 1) {
                    paddingTop += this.f;
                }
            } else if (bVar instanceof a) {
                a aVar = (a) bVar;
                String str = aVar.a;
                String str2 = aVar.b;
                float measureText = this.d.measureText(str2);
                float f3 = measuredWidth - paddingLeft;
                List<String> b2 = b(str, ((f3 - this.h) - measureText) - paddingRight, this.d);
                f = i > 0 ? 0.0f + this.g : 0.0f;
                canvas.drawText(str2, f3 - measureText, (paddingTop - this.d.ascent()) + f, this.d);
                int size2 = b2.size();
                float f4 = f;
                for (int i3 = 0; i3 < size2; i3++) {
                    canvas.drawText(b2.get(i3), paddingLeft, (paddingTop - this.d.ascent()) + f4, this.d);
                    f4 += this.d.descent() - this.d.ascent();
                    if (i3 < size2 - 1) {
                        f4 += this.i;
                    }
                }
                paddingTop += f4;
                if (i < this.b.size() - 1) {
                    paddingTop += this.g;
                }
            }
            i++;
        }
    }

    private float a(String str, float f, Paint paint) {
        Object[] objArr = {str, Float.valueOf(f), paint};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd15ae5998045fb7ec16c36ed1a5f004", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd15ae5998045fb7ec16c36ed1a5f004")).floatValue();
        }
        int size = b(str, f, paint).size();
        return ((paint.descent() - paint.ascent()) * size) + ((size - 1) * this.i);
    }

    private List<String> b(String str, float f, Paint paint) {
        int i = 0;
        Object[] objArr = {str, Float.valueOf(f), paint};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd40da137360f2e267863479dc043c21", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd40da137360f2e267863479dc043c21");
        }
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        float[] fArr = {0.0f};
        while (i < length) {
            int breakText = paint.breakText(str, i, length, true, f, fArr) + i;
            int indexOf = str.substring(i, breakText).indexOf(10);
            if (indexOf <= 0) {
                arrayList.add(str.substring(i, breakText));
                i = breakText;
            } else {
                arrayList.add(str.substring(i, i + indexOf));
                i += indexOf + 1;
            }
        }
        if (arrayList.size() > 1) {
            String str2 = (String) arrayList.get(arrayList.size() - 1);
            if ("）".equals(str2) || CommonConstant.Symbol.BRACKET_RIGHT.equals(str2)) {
                arrayList.remove(arrayList.size() - 1);
                arrayList.add(((String) arrayList.remove(arrayList.size() - 1)) + str2);
            }
        }
        return arrayList;
    }
}
