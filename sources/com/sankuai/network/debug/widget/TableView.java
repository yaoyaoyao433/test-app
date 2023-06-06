package com.sankuai.network.debug.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TableView extends LinearLayout implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    public Adapter b;
    public Handler c;
    private final DataSetObserver d;
    private a e;
    private Drawable f;
    private Drawable g;
    private Drawable h;
    private int i;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
    }

    public TableView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e42a3d53294d7530a7fbe277224423f0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e42a3d53294d7530a7fbe277224423f0");
        }
    }

    public TableView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3442cda8c0b136926fb395dd4c926e6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3442cda8c0b136926fb395dd4c926e6");
            return;
        }
        this.d = new DataSetObserver() { // from class: com.sankuai.network.debug.widget.TableView.1
            public static ChangeQuickRedirect a;

            @Override // android.database.DataSetObserver
            public final void onChanged() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2e61a7f7122b9d9a574c0d0f49fd0399", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2e61a7f7122b9d9a574c0d0f49fd0399");
                    return;
                }
                TableView.this.c.removeMessages(1);
                TableView.this.c.sendEmptyMessageDelayed(1, 100L);
            }

            @Override // android.database.DataSetObserver
            public final void onInvalidated() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "218deedc1114fa7016d2d069f9acd615", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "218deedc1114fa7016d2d069f9acd615");
                } else {
                    onChanged();
                }
            }
        };
        this.c = new Handler() { // from class: com.sankuai.network.debug.widget.TableView.2
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5c55a357e137072c548b7e023a3862b8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5c55a357e137072c548b7e023a3862b8");
                } else if (message.what == 1) {
                    if (TableView.this.b == null || TableView.this.b.isEmpty()) {
                        TableView.this.removeAllViews();
                        return;
                    }
                    TableView.this.removeAllViews();
                    for (int i = 0; i < TableView.this.b.getCount(); i++) {
                        try {
                            TableView.this.addView(TableView.this.b.getView(i, null, TableView.this));
                        } catch (Exception e) {
                            e.printStackTrace();
                            return;
                        }
                    }
                }
            }
        };
        this.f = getResources().getDrawable(R.drawable.sk_network_gray_horizontal_line);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.sk_network_divider_padding});
        this.i = obtainStyledAttributes.getDimensionPixelSize(0, getResources().getDimensionPixelOffset(R.dimen.sk_network_table_item_padding));
        obtainStyledAttributes.recycle();
        setOrientation(1);
    }

    public Drawable getDivider() {
        return this.f;
    }

    public void setDivider(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4864cff21e7baa4755997f429e4684e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4864cff21e7baa4755997f429e4684e2");
        } else if (drawable == this.f) {
        } else {
            this.f = drawable;
            requestLayout();
        }
    }

    public void setDividerOfGroupEnd(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ec9416d9828a8cd6a6d4ccd7b240024", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ec9416d9828a8cd6a6d4ccd7b240024");
            return;
        }
        this.g = drawable;
        requestLayout();
    }

    public void setDividerOfGroupEnd(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ac5e6c38185ccebd05e2471416d37e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ac5e6c38185ccebd05e2471416d37e4");
        } else if (i > 0) {
            this.g = getResources().getDrawable(i);
            requestLayout();
        }
    }

    public void setDividerOfGroupHeader(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "082ea736888f5c2383caa4aa0d0e5201", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "082ea736888f5c2383caa4aa0d0e5201");
            return;
        }
        this.h = drawable;
        requestLayout();
    }

    public void setDividerOfGroupHeader(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3efb34d97a5fcaefc7d48fa566551bd3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3efb34d97a5fcaefc7d48fa566551bd3");
        } else if (i > 0) {
            this.h = getResources().getDrawable(i);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void childDrawableStateChanged(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5598325ae5cef0d66ffb1ce48a50a998", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5598325ae5cef0d66ffb1ce48a50a998");
            return;
        }
        super.childDrawableStateChanged(view);
        if (this.f != null) {
            invalidate(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        boolean z;
        int i = 1;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3559637ef9a204f1ee758af5af84e47c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3559637ef9a204f1ee758af5af84e47c");
            return;
        }
        super.dispatchDraw(canvas);
        if (this.f != null) {
            int i2 = 0;
            while (i2 < getChildCount()) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() == 0 && !(childAt instanceof TableHeader) && childAt.getHeight() > 0) {
                    Object[] objArr2 = new Object[i];
                    objArr2[0] = Integer.valueOf(i2);
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "73f79c8443a088e73d681f7df3f92514", RobustBitConfig.DEFAULT_VALUE)) {
                        int i3 = i2 - 1;
                        while (true) {
                            if (i3 >= 0) {
                                View childAt2 = getChildAt(i3);
                                if (childAt2 != null && childAt2.getVisibility() == 0) {
                                    z = childAt2 instanceof TableHeader;
                                    break;
                                }
                                i3--;
                            } else {
                                z = true;
                                break;
                            }
                        }
                    } else {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "73f79c8443a088e73d681f7df3f92514")).booleanValue();
                    }
                    if (z) {
                        Object[] objArr3 = new Object[2];
                        objArr3[0] = canvas;
                        objArr3[i] = childAt;
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e056b0a7dad5864abea9e0e116c91a84", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e056b0a7dad5864abea9e0e116c91a84");
                        } else {
                            Drawable drawable = this.h == null ? this.f : this.h;
                            if (drawable != null) {
                                drawable.setState(childAt.getDrawableState());
                                int intrinsicHeight = drawable.getCurrent().getIntrinsicHeight();
                                if (intrinsicHeight > 0) {
                                    Rect rect = new Rect();
                                    rect.left = getPaddingLeft();
                                    rect.top = childAt.getTop() - intrinsicHeight;
                                    rect.right = (getRight() - getLeft()) - getPaddingRight();
                                    rect.bottom = childAt.getTop();
                                    drawable.setBounds(rect);
                                    drawable.draw(canvas);
                                }
                            }
                        }
                    }
                    if (a(i2)) {
                        Object[] objArr4 = {canvas, childAt};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f466bbf4049af70a00c5bcaddfe17335", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f466bbf4049af70a00c5bcaddfe17335");
                        } else {
                            Drawable drawable2 = this.g == null ? this.f : this.g;
                            if (drawable2 != null) {
                                drawable2.setState(childAt.getDrawableState());
                                int intrinsicHeight2 = drawable2.getCurrent().getIntrinsicHeight();
                                if (intrinsicHeight2 > 0) {
                                    Rect rect2 = new Rect();
                                    rect2.left = getPaddingLeft();
                                    rect2.top = childAt.getBottom() - intrinsicHeight2;
                                    rect2.right = (getRight() - getLeft()) - getPaddingRight();
                                    rect2.bottom = childAt.getBottom();
                                    drawable2.setBounds(rect2);
                                    drawable2.draw(canvas);
                                }
                            }
                        }
                    } else {
                        Object[] objArr5 = {canvas, childAt};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "384079e2adf1a90274e88b9197920446", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "384079e2adf1a90274e88b9197920446");
                        } else if (this.f != null) {
                            this.f.setState(childAt.getDrawableState());
                            int intrinsicHeight3 = this.f.getCurrent().getIntrinsicHeight();
                            if (intrinsicHeight3 > 0) {
                                Rect rect3 = new Rect();
                                rect3.left = getPaddingLeft() + this.i;
                                rect3.top = childAt.getBottom() - intrinsicHeight3;
                                rect3.right = (getRight() - getLeft()) - getPaddingRight();
                                rect3.bottom = childAt.getBottom();
                                this.f.setBounds(rect3);
                                this.f.draw(canvas);
                            }
                        }
                        i2++;
                        i = 1;
                    }
                }
                i2++;
                i = 1;
            }
        }
    }

    private boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5de618df3fb5c826bc5ccb0970d2ec27", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5de618df3fb5c826bc5ccb0970d2ec27")).booleanValue();
        }
        for (int i2 = i + 1; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && childAt.getVisibility() == 0) {
                return childAt instanceof TableHeader;
            }
        }
        return true;
    }

    public void setOnItemClickListener(a aVar) {
        this.e = aVar;
    }

    public Adapter getAdapter() {
        return this.b;
    }

    public void setAdapter(Adapter adapter) {
        Object[] objArr = {adapter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41ef0fdb7404bcddd918f83c47a7cb89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41ef0fdb7404bcddd918f83c47a7cb89");
            return;
        }
        if (this.b != null) {
            this.b.unregisterDataSetObserver(this.d);
        }
        this.b = adapter;
        if (this.b != null) {
            this.b.registerDataSetObserver(this.d);
        }
        removeAllViews();
        this.d.onChanged();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 0;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "594fddc7023e589d1fc7b6ca49c27ca0", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "594fddc7023e589d1fc7b6ca49c27ca0");
        } else if (this.e != null) {
            int i2 = -1;
            while (true) {
                if (i >= getChildCount()) {
                    break;
                } else if (view == getChildAt(i)) {
                    i2 = i;
                    break;
                } else {
                    i++;
                }
            }
            if (i2 < 0) {
                return;
            }
            if ((this.b != null ? this.b.getItemId(i2) : -1L) == -1) {
                view.getId();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "524592b1afbafe66d3d3bceae421dc72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "524592b1afbafe66d3d3bceae421dc72");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt != null && childAt.getVisibility() == 0 && !(childAt instanceof AdapterView) && this.e != null) {
                boolean isClickable = childAt.isClickable();
                childAt.setOnClickListener(this);
                if (!isClickable) {
                    childAt.setClickable(false);
                }
            }
        }
    }
}
