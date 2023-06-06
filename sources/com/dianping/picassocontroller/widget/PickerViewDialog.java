package com.dianping.picassocontroller.widget;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.constraint.R;
import android.widget.LinearLayout;
import com.dianping.picasso.PicassoUtils;
import com.dianping.picassocontroller.widget.WheelView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PickerViewDialog extends Dialog {
    public static ChangeQuickRedirect a;
    private final LinearLayout b;
    private final ArrayList<WheelView> c;

    public PickerViewDialog(Context context, int i) {
        super(context, 3);
        Object[] objArr = {context, 3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eeaafa9b234589b2d1c6901b89002ddb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eeaafa9b234589b2d1c6901b89002ddb");
            return;
        }
        this.c = new ArrayList<>();
        ColorDrawable colorDrawable = new ColorDrawable();
        colorDrawable.setAlpha(0);
        getWindow().setBackgroundDrawable(colorDrawable);
        setContentView(R.layout.pcs_dialog_picker);
        this.b = (LinearLayout) findViewById(R.id.layout_container);
    }

    public WheelView a(WheelView.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29bf47dee47ecc28d9d60fd135579b11", RobustBitConfig.DEFAULT_VALUE)) {
            return (WheelView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29bf47dee47ecc28d9d60fd135579b11");
        }
        WheelView wheelView = new WheelView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.weight = 1.0f;
        layoutParams.leftMargin = PicassoUtils.dp2px(getContext(), 15.0f);
        layoutParams.rightMargin = PicassoUtils.dp2px(getContext(), 15.0f);
        this.b.addView(wheelView, layoutParams);
        wheelView.setAdapter(bVar);
        this.c.add(wheelView);
        return wheelView;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class a implements WheelView.b {
        public static ChangeQuickRedirect a;
        private final String[] c;

        private a(String[] strArr) {
            Object[] objArr = {PickerViewDialog.this, strArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89a2d7b0f9cfce8525e1daac5839fdab", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89a2d7b0f9cfce8525e1daac5839fdab");
            } else {
                this.c = strArr == null ? new String[0] : strArr;
            }
        }

        @Override // com.dianping.picassocontroller.widget.WheelView.b
        public final int a() {
            return this.c.length;
        }

        @Override // com.dianping.picassocontroller.widget.WheelView.b
        public final String a(int i) {
            return this.c[i];
        }
    }
}
