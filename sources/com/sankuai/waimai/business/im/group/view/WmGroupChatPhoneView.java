package com.sankuai.waimai.business.im.group.View;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.group.model.WmGroupShareData;
import com.sankuai.waimai.foundation.utils.ac;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.z;
import com.sankuai.waimai.platform.widget.dial.injection.a;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WmGroupChatPhoneView extends LinearLayout implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    public View b;
    public View c;
    public ListView d;
    public ListView e;
    public WmGroupShareData f;
    private View g;
    private View.OnClickListener h;

    public static /* synthetic */ void a(WmGroupChatPhoneView wmGroupChatPhoneView, int i, long j, boolean z, String[] strArr, String str, int i2) {
        Object[] objArr = {Integer.valueOf(i), new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), strArr, str, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, wmGroupChatPhoneView, changeQuickRedirect, false, "99c90e8a39edc54352466d0e9660f538", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, wmGroupChatPhoneView, changeQuickRedirect, false, "99c90e8a39edc54352466d0e9660f538");
        } else if (wmGroupChatPhoneView.getContext() != null) {
            if (!ac.a(wmGroupChatPhoneView.getContext())) {
                ae.a(wmGroupChatPhoneView.getContext(), (int) R.string.wm_im_your_phone_can_not_be_connected);
            } else if (strArr == null || strArr.length == 0) {
                ae.a(wmGroupChatPhoneView.getContext(), (int) R.string.wm_im_no_available_phone_num);
            } else if (z && j > 0) {
                ArrayList<String> arrayList = new ArrayList<>();
                for (String str2 : strArr) {
                    if (!TextUtils.isEmpty(str2)) {
                        arrayList.add(str2);
                    }
                }
                a.a(wmGroupChatPhoneView.getContext()).a(String.valueOf(j), arrayList, str, i);
            } else {
                z.a(wmGroupChatPhoneView.getContext(), strArr[i2]);
            }
        }
    }

    public WmGroupChatPhoneView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1769461453d27fd921b74942cf3d163", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1769461453d27fd921b74942cf3d163");
        }
    }

    public WmGroupChatPhoneView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d519ebf9a64130913d4443c43c398201", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d519ebf9a64130913d4443c43c398201");
        }
    }

    public WmGroupChatPhoneView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b98f014c2d591001c45c54740c5e6bcd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b98f014c2d591001c45c54740c5e6bcd");
        } else {
            this.f = WmGroupShareData.a(context);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44f1bf4552fc2894a596cfead4146ec3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44f1bf4552fc2894a596cfead4146ec3");
            return;
        }
        super.onFinishInflate();
        this.b = findViewById(R.id.wm_im_group_chat_poi_phones_container);
        this.d = (ListView) findViewById(R.id.wm_im_group_chat_poi_phones_lv);
        this.c = findViewById(R.id.wm_im_group_chat_rider_phones_container);
        this.e = (ListView) findViewById(R.id.wm_im_group_chat_rider_phones_lv);
        this.g = findViewById(R.id.wm_im_group_btn_cancel);
        this.g.setOnClickListener(this);
    }

    public void setOnCancelClickListener(View.OnClickListener onClickListener) {
        this.h = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f08ac08404effd71c8453b6441534bf2", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f08ac08404effd71c8453b6441534bf2");
        } else if (R.id.wm_im_group_btn_cancel != view.getId() || this.h == null) {
        } else {
            this.h.onClick(view);
        }
    }
}
