package com.meituan.android.pay.hellodialog;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.meituan.android.pay.model.bean.ActionButton;
import com.meituan.android.pay.model.bean.DisplayDialog;
import com.meituan.android.pay.model.bean.RealNameInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RealNameInfoDialog extends Dialog {
    public static ChangeQuickRedirect a;
    private a b;
    private DisplayDialog c;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
    }

    public RealNameInfoDialog(@NonNull Context context, @NonNull DisplayDialog displayDialog, a aVar) {
        super(context, R.style.paycommon__transparent_dialog);
        Object[] objArr = {context, displayDialog, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81b4c4a8e71cfc66f37dbbf7ee20cddc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81b4c4a8e71cfc66f37dbbf7ee20cddc");
            return;
        }
        this.c = displayDialog;
        this.b = null;
        setContentView(LayoutInflater.from(context).inflate(R.layout.mpay__real_name_dialog, (ViewGroup) null), new ViewGroup.LayoutParams((int) (((WindowManager) context.getSystemService("window")).getDefaultDisplay().getWidth() * 0.833d), -2));
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "565884aae5c70c4426ad37aea5b4026d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "565884aae5c70c4426ad37aea5b4026d");
            return;
        }
        DisplayDialog displayDialog2 = this.c;
        ((TextView) findViewById(R.id.title)).setText(displayDialog2.getTitle());
        ((TextView) findViewById(R.id.tip)).setText(displayDialog2.getTip());
        List<RealNameInfo> realNameInfo = displayDialog2.getRealNameInfo();
        if (realNameInfo != null && realNameInfo.size() > 1) {
            ((TextView) findViewById(R.id.info_name1)).setText(realNameInfo.get(0).getName());
            ((TextView) findViewById(R.id.info_content1)).setText(realNameInfo.get(0).getMsg());
            if (!TextUtils.isEmpty(realNameInfo.get(0).getMark())) {
                findViewById(R.id.mark1).setVisibility(0);
                ((TextView) findViewById(R.id.mark1)).setText(realNameInfo.get(0).getMark());
            }
            ((TextView) findViewById(R.id.info_name2)).setText(realNameInfo.get(1).getName());
            ((TextView) findViewById(R.id.info_content2)).setText(realNameInfo.get(1).getMsg());
            if (!TextUtils.isEmpty(realNameInfo.get(1).getMark())) {
                findViewById(R.id.mark2).setVisibility(0);
                ((TextView) findViewById(R.id.mark2)).setText(realNameInfo.get(1).getMark());
            }
        } else {
            findViewById(R.id.real_name_infos).setVisibility(8);
        }
        List<ActionButton> buttons = displayDialog2.getButtons();
        if (buttons != null && buttons.size() > 1) {
            TextView textView = (TextView) findViewById(R.id.left_btn);
            textView.setText(buttons.get(0).getButtonName());
            textView.setOnClickListener(c.a(this, buttons));
            TextView textView2 = (TextView) findViewById(R.id.right_btn);
            textView2.setText(buttons.get(1).getButtonName());
            textView2.setOnClickListener(d.a(this, buttons));
            return;
        }
        findViewById(R.id.alert_divider).setVisibility(8);
        findViewById(R.id.left_btn).setVisibility(8);
        findViewById(R.id.right_btn).setOnClickListener(e.a(this));
    }

    public static /* synthetic */ void b(RealNameInfoDialog realNameInfoDialog, List list, View view) {
        Object[] objArr = {realNameInfoDialog, list, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0dde426b97aa83d9eb9b59c822f45d74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0dde426b97aa83d9eb9b59c822f45d74");
            return;
        }
        if (realNameInfoDialog.b != null) {
            TextUtils.isEmpty(((ActionButton) list.get(0)).getButtonAction());
        }
        realNameInfoDialog.dismiss();
    }

    public static /* synthetic */ void a(RealNameInfoDialog realNameInfoDialog, List list, View view) {
        Object[] objArr = {realNameInfoDialog, list, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "71929be6c9c7310781d9be52e30d48dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "71929be6c9c7310781d9be52e30d48dc");
            return;
        }
        if (realNameInfoDialog.b != null) {
            TextUtils.isEmpty(((ActionButton) list.get(1)).getButtonAction());
        }
        realNameInfoDialog.dismiss();
    }

    public static /* synthetic */ void a(RealNameInfoDialog realNameInfoDialog, View view) {
        Object[] objArr = {realNameInfoDialog, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "11684957494e436ed2abc670efacf9d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "11684957494e436ed2abc670efacf9d1");
        } else {
            realNameInfoDialog.dismiss();
        }
    }
}
