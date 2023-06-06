package com.meituan.android.customerservice.channel.upload;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.customerservice.channel.retrofit.bean.CaseUploadVoucherSyncRequest;
import com.meituan.android.customerservice.channel.retrofit.bean.UploadFileResultEntity;
import com.meituan.android.customerservice.channel.upload.bean.UploadFileInfo;
import com.meituan.android.customerservice.channel.upload.d;
import com.meituan.android.customerservice.channel.widget.DownToUpSlideDialog;
import com.meituan.android.customerservice.channel.widget.XWEditText;
import com.meituan.android.customerservice.kit.utils.i;
import com.meituan.android.customerservice.utils.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.widget.MediaWidget;
import com.sankuai.titans.widget.PickerBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class UploadFilesDialog extends Dialog implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    public final ArrayList<String> b;
    public final ArrayList<String> c;
    public Activity d;
    public DownToUpSlideDialog e;
    public SubmitResultDialog f;
    public UploadFilesProcessDialog g;
    public a h;
    public View i;
    private d j;
    private RecyclerView k;
    private XWEditText l;
    private TextView m;
    private LinearLayout n;
    private TextView o;
    private ImageView p;
    private i.a q;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void a(CaseUploadVoucherSyncRequest caseUploadVoucherSyncRequest);

        void a(ArrayList<UploadFileInfo> arrayList, int i);
    }

    public UploadFilesDialog(Activity activity) {
        super(activity, R.style.cs_dialog_DownToUpSlideDialog);
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65ede6c792ff6465f15a0b66430b0a3c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65ede6c792ff6465f15a0b66430b0a3c");
            return;
        }
        this.b = new ArrayList<>(Arrays.asList(CommonConstant.File.JPG, CommonConstant.File.JPEG, "png"));
        this.c = new ArrayList<>(Arrays.asList("mp4", "mov"));
        this.d = activity;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6976b55a110ce7038d283ea5b6bf1f5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6976b55a110ce7038d283ea5b6bf1f5d");
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.cs_view_upload_file);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1825ae7963e77504bb08fee1f6c38164", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1825ae7963e77504bb08fee1f6c38164");
        } else {
            findViewById(R.id.btn_close).setOnClickListener(this);
            this.i = findViewById(R.id.view_root);
            this.n = (LinearLayout) findViewById(R.id.btn_submit);
            this.n.setOnClickListener(this);
            this.o = (TextView) findViewById(R.id.tv_submit);
            this.p = (ImageView) findViewById(R.id.iv_loading);
            this.m = (TextView) findViewById(R.id.tv_problem_description_tip);
            this.l = (XWEditText) findViewById(R.id.et_problem_description);
            this.l.addTextChangedListener(new TextWatcher() { // from class: com.meituan.android.customerservice.channel.upload.UploadFilesDialog.1
                public static ChangeQuickRedirect a;

                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    Object[] objArr3 = {editable};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e64b82dc26c99278082ef023992f0345", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e64b82dc26c99278082ef023992f0345");
                    } else if (editable == null || editable.length() <= 0) {
                        UploadFilesDialog.this.m.setVisibility(8);
                        UploadFilesDialog.this.l.setLines(1);
                        UploadFilesDialog.this.l.setPadding(com.meituan.android.customerservice.kit.utils.c.a(UploadFilesDialog.this.d, 10.5f), com.meituan.android.customerservice.kit.utils.c.a(UploadFilesDialog.this.d, 13.5f), com.meituan.android.customerservice.kit.utils.c.a(UploadFilesDialog.this.d, 10.5f), com.meituan.android.customerservice.kit.utils.c.a(UploadFilesDialog.this.d, 13.5f));
                    } else {
                        UploadFilesDialog.this.m.setVisibility(0);
                        UploadFilesDialog.this.l.setLines(3);
                        UploadFilesDialog.this.l.setPadding(com.meituan.android.customerservice.kit.utils.c.a(UploadFilesDialog.this.d, 10.5f), com.meituan.android.customerservice.kit.utils.c.a(UploadFilesDialog.this.d, 13.5f), com.meituan.android.customerservice.kit.utils.c.a(UploadFilesDialog.this.d, 10.5f), com.meituan.android.customerservice.kit.utils.c.a(UploadFilesDialog.this.d, 4.0f));
                        TextView textView = UploadFilesDialog.this.m;
                        textView.setText(editable.length() + "/120");
                    }
                }
            });
            this.k = (RecyclerView) findViewById(R.id.recyclerView_upload_files);
            this.j = new d(this.d);
            this.k.setAdapter(this.j);
            this.k.setLayoutManager(new GridLayoutManager(this.d, 3) { // from class: com.meituan.android.customerservice.channel.upload.UploadFilesDialog.2
                @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
                public boolean canScrollVertically() {
                    return false;
                }
            });
            this.j.d = new d.c() { // from class: com.meituan.android.customerservice.channel.upload.UploadFilesDialog.5
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.customerservice.channel.upload.d.c
                public final void a(int i) {
                    Object[] objArr3 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "786340aded8f712b0c204c119f349cc3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "786340aded8f712b0c204c119f349cc3");
                    } else if (i != 1) {
                    } else {
                        UploadFilesDialog.this.b();
                    }
                }
            };
            this.j.e = new d.InterfaceC0242d() { // from class: com.meituan.android.customerservice.channel.upload.UploadFilesDialog.6
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.customerservice.channel.upload.d.InterfaceC0242d
                public final void a(int i) {
                    Object[] objArr3 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c21ffcb544f6dac9c9de6436d890e32e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c21ffcb544f6dac9c9de6436d890e32e");
                    } else {
                        UploadFilesDialog.this.a(false);
                    }
                }
            };
            a(false);
        }
        Window window = getWindow();
        window.getAttributes().width = -1;
        window.setGravity(81);
        window.setSoftInputMode(18);
        setCanceledOnTouchOutside(false);
    }

    @Override // android.app.Dialog
    public void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ef9e89c342f368827684b67bbd8019f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ef9e89c342f368827684b67bbd8019f");
        } else if (this.d == null || this.d.isFinishing() || isShowing()) {
        } else {
            super.show();
        }
    }

    @Override // android.app.Dialog
    public boolean isShowing() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ca77b6e1a452274ef9e465ef1451047", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ca77b6e1a452274ef9e465ef1451047")).booleanValue();
        }
        if (this.d == null || this.d.isFinishing()) {
            return false;
        }
        return super.isShowing();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        InputMethodManager inputMethodManager;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3990caa324edc4f7c6ebe03373bda5d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3990caa324edc4f7c6ebe03373bda5d0");
            return;
        }
        View currentFocus = getCurrentFocus();
        if (currentFocus != null && (inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method")) != null && currentFocus.getWindowToken() != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
        super.dismiss();
    }

    private void a(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6959bd83bd82161218face337a170500", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6959bd83bd82161218face337a170500");
        } else if (TextUtils.isEmpty(str) || this.d == null || this.d.isFinishing()) {
        } else {
            if (this.q == null) {
                this.q = new i.a();
            }
            f.a().postDelayed(new Runnable() { // from class: com.meituan.android.customerservice.channel.upload.UploadFilesDialog.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b1f8defeb4d91ffc49d287e702fb9a88", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b1f8defeb4d91ffc49d287e702fb9a88");
                    } else if (UploadFilesDialog.this.d == null || UploadFilesDialog.this.d.isFinishing() || UploadFilesDialog.this.i == null) {
                    } else {
                        i.a aVar = UploadFilesDialog.this.q;
                        aVar.c = str;
                        aVar.b = UploadFilesDialog.this.i;
                        aVar.b(UploadFilesDialog.this.d);
                    }
                }
            }, 500L);
        }
    }

    private String b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cfac5d5c2d35281eefc6f6884bdc69d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cfac5d5c2d35281eefc6f6884bdc69d") : (this.d == null || this.d.isFinishing()) ? "" : this.d.getString(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(int i, Object... objArr) {
        Object[] objArr2 = {Integer.valueOf(i), objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "8416914ab9b70a373e48ac66e57d7979", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "8416914ab9b70a373e48ac66e57d7979") : (this.d == null || this.d.isFinishing()) ? "" : this.d.getString(i, objArr);
    }

    public final void a(final ArrayList<UploadFileInfo> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00eeaadbb9e2cb118f7ebfa85c31e455", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00eeaadbb9e2cb118f7ebfa85c31e455");
            return;
        }
        a(100);
        f.a().postDelayed(new Runnable() { // from class: com.meituan.android.customerservice.channel.upload.UploadFilesDialog.8
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "528df0cb99ddcdb40772db68cf6c8c15", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "528df0cb99ddcdb40772db68cf6c8c15");
                    return;
                }
                UploadFilesDialog.this.a();
                d dVar = UploadFilesDialog.this.j;
                ArrayList arrayList2 = arrayList;
                Object[] objArr3 = {arrayList2};
                ChangeQuickRedirect changeQuickRedirect3 = d.a;
                if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "38dd25dc9257178efa43954991a1f24a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "38dd25dc9257178efa43954991a1f24a");
                } else if (arrayList2 != null) {
                    int size = arrayList2.size() - (dVar.b - dVar.c.size());
                    if (size > 0) {
                        while (size > 0) {
                            arrayList2.remove(arrayList2.size() - 1);
                            size--;
                        }
                    }
                    dVar.c.addAll(arrayList2);
                    dVar.notifyDataSetChanged();
                }
                UploadFilesDialog.this.a(false);
            }
        }, 100L);
    }

    public final void a(int i, ArrayList<UploadFileInfo> arrayList) {
        Object[] objArr = {Integer.valueOf(i), arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c73ebdb346efc819d2844a2fafdb5039", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c73ebdb346efc819d2844a2fafdb5039");
        } else {
            a(i, arrayList, -1);
        }
    }

    public final void a(int i, ArrayList<UploadFileInfo> arrayList, int i2) {
        Object[] objArr = {Integer.valueOf(i), arrayList, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb5802ea38a214c9be0fccf201e8cdb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb5802ea38a214c9be0fccf201e8cdb2");
        } else if (arrayList.isEmpty()) {
            c(i2);
        } else {
            a(arrayList);
            a(a(R.string.cs_upload_few_files_upload_failed, Integer.valueOf(i)));
        }
    }

    private void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55aa1e64ff24ed152a37125352e6dc6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55aa1e64ff24ed152a37125352e6dc6c");
            return;
        }
        a();
        if (i == -1) {
            i = R.string.cs_upload_files_upload_failed;
        }
        a(b(i));
    }

    public final void a(final boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85da9001c224dd7c60d2bb699d7eefe6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85da9001c224dd7c60d2bb699d7eefe6");
        } else {
            f.a().post(new Runnable() { // from class: com.meituan.android.customerservice.channel.upload.UploadFilesDialog.9
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0b8f7898c2999d18b4da08714fe6233d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0b8f7898c2999d18b4da08714fe6233d");
                    } else if (z) {
                        com.meituan.android.customerservice.channel.utils.c.a(UploadFilesDialog.this.i, false);
                        UploadFilesDialog.this.setCancelable(false);
                        ((GradientDrawable) UploadFilesDialog.this.n.getBackground()).setColor(ContextCompat.getColor(UploadFilesDialog.this.d, R.color.cs_upload_btn_submit_click));
                        UploadFilesDialog.this.o.setTextColor(ContextCompat.getColor(UploadFilesDialog.this.d, R.color.cs_upload_text_submit_click));
                        UploadFilesDialog.this.p.setVisibility(0);
                    } else {
                        com.meituan.android.customerservice.channel.utils.c.a(UploadFilesDialog.this.i, true);
                        UploadFilesDialog.this.setCancelable(true);
                        UploadFilesDialog.this.p.setVisibility(8);
                        if (UploadFilesDialog.this.j.b() > 0) {
                            UploadFilesDialog.this.n.setEnabled(true);
                            ((GradientDrawable) UploadFilesDialog.this.n.getBackground()).setColor(ContextCompat.getColor(UploadFilesDialog.this.d, R.color.cs_upload_btn_submit_enabled));
                            UploadFilesDialog.this.o.setTextColor(ContextCompat.getColor(UploadFilesDialog.this.d, R.color.cs_upload_text_submit_enabled));
                            return;
                        }
                        UploadFilesDialog.this.n.setEnabled(false);
                        ((GradientDrawable) UploadFilesDialog.this.n.getBackground()).setColor(ContextCompat.getColor(UploadFilesDialog.this.d, R.color.cs_upload_btn_submit_unenabled));
                        UploadFilesDialog.this.o.setTextColor(ContextCompat.getColor(UploadFilesDialog.this.d, R.color.cs_upload_text_submit_unenabled));
                    }
                }
            });
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8908300be2169520b85e78b9cb50049a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8908300be2169520b85e78b9cb50049a");
        } else if (this.d == null || this.d.isFinishing() || this.g == null || !this.g.isShowing()) {
        } else {
            this.g.a(i);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2557797c279a9d719d92fc77dc35d5ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2557797c279a9d719d92fc77dc35d5ec");
        } else if (this.g == null) {
            show();
        } else {
            if (this.g.isShowing()) {
                this.g.dismiss();
            }
            show();
            this.g = null;
        }
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07903d60cac19da089905a23cb4c379e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07903d60cac19da089905a23cb4c379e");
        } else if (this.d == null || this.d.isFinishing()) {
        } else {
            if (!z) {
                a(false);
                a(b(R.string.cs_upload_proofs_failed));
                return;
            }
            c();
            if (this.f == null || !this.f.isShowing()) {
                this.f = new SubmitResultDialog(this.d);
                this.f.show();
            }
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "892b4e5f80b6bbe01d099ef1a195fc13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "892b4e5f80b6bbe01d099ef1a195fc13");
        } else if (this.d != null && !this.d.isFinishing()) {
            dismiss();
            if (this.e == null || !this.e.isShowing()) {
                this.e = new DownToUpSlideDialog(this.d);
                String[] stringArray = this.d.getResources().getStringArray(R.array.cs_upload_files_type_array);
                DownToUpSlideDialog downToUpSlideDialog = this.e;
                Object[] objArr2 = {stringArray};
                ChangeQuickRedirect changeQuickRedirect2 = DownToUpSlideDialog.a;
                if (PatchProxy.isSupport(objArr2, downToUpSlideDialog, changeQuickRedirect2, false, "4816ec8e8b8c4b46c1c3b0658ba0d0ec", RobustBitConfig.DEFAULT_VALUE)) {
                    ArrayList arrayList = (ArrayList) PatchProxy.accessDispatch(objArr2, downToUpSlideDialog, changeQuickRedirect2, false, "4816ec8e8b8c4b46c1c3b0658ba0d0ec");
                } else {
                    downToUpSlideDialog.e.clear();
                    int i = 0;
                    for (String str : stringArray) {
                        DownToUpSlideDialog.a aVar = new DownToUpSlideDialog.a();
                        aVar.a = str;
                        aVar.b = R.style.cs_dialog_TextLineButton;
                        aVar.d = com.meituan.android.customerservice.kit.utils.c.a(downToUpSlideDialog.d, 15.5f);
                        aVar.c = com.meituan.android.customerservice.kit.utils.c.a(downToUpSlideDialog.d, 16.0f);
                        downToUpSlideDialog.e.add(aVar);
                        i++;
                    }
                    downToUpSlideDialog.g = new boolean[i];
                    for (int i2 = 0; i2 < downToUpSlideDialog.g.length; i2++) {
                        downToUpSlideDialog.g[i2] = true;
                    }
                    ArrayList<DownToUpSlideDialog.a> arrayList2 = downToUpSlideDialog.e;
                }
                this.e.b = new DownToUpSlideDialog.c() { // from class: com.meituan.android.customerservice.channel.upload.UploadFilesDialog.11
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.customerservice.channel.widget.DownToUpSlideDialog.c
                    public final void a(int i3) {
                        Object[] objArr3 = {Integer.valueOf(i3)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c60ba70b613bca2fe3659c3017141ed4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c60ba70b613bca2fe3659c3017141ed4");
                            return;
                        }
                        switch (i3) {
                            case 0:
                                int b = UploadFilesDialog.this.j.b - UploadFilesDialog.this.j.b();
                                Activity activity = UploadFilesDialog.this.d;
                                String a2 = UploadFilesDialog.this.a(R.string.cs_upload_choose_files_limit, Integer.valueOf(b));
                                ArrayList<String> arrayList3 = UploadFilesDialog.this.b;
                                Object[] objArr4 = {activity, Integer.valueOf(b), null, 1, a2, 52428800L, arrayList3};
                                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.customerservice.channel.utils.b.a;
                                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "23d5dd40bf9d24705a6af55102f1a458", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "23d5dd40bf9d24705a6af55102f1a458");
                                    return;
                                } else if (activity == null || activity.isFinishing()) {
                                    return;
                                } else {
                                    ArrayList<String> arrayList4 = new ArrayList<>();
                                    PickerBuilder pickerBuilder = new PickerBuilder();
                                    pickerBuilder.mediaType("image").source("album").accessToken("pt-76641b6e2e3e4ebb").requestCode(1).maxCount(b).chosenAssets(arrayList4).maxCountHint(a2).maxFileSize(52428800L).includeExtName((String[]) arrayList3.toArray(new String[arrayList3.size()]));
                                    MediaWidget.getInstance().openMediaPicker(activity, pickerBuilder);
                                    return;
                                }
                            case 1:
                                Activity activity2 = UploadFilesDialog.this.d;
                                ArrayList<String> arrayList5 = UploadFilesDialog.this.c;
                                Object[] objArr5 = {activity2, 2, 52428800L, arrayList5};
                                ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.customerservice.channel.utils.b.a;
                                if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "7b193e1cab9f1611fa03fea40bf76bde", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "7b193e1cab9f1611fa03fea40bf76bde");
                                    return;
                                } else if (activity2 == null || activity2.isFinishing()) {
                                    return;
                                } else {
                                    PickerBuilder pickerBuilder2 = new PickerBuilder();
                                    pickerBuilder2.mediaType("video").source("album").accessToken("pt-76641b6e2e3e4ebb").requestCode(2).maxFileSize(52428800L).includeExtName((String[]) arrayList5.toArray(new String[arrayList5.size()]));
                                    MediaWidget.getInstance().openMediaPicker(activity2, pickerBuilder2);
                                    return;
                                }
                            case 2:
                                UploadFilesDialog.this.e.dismiss();
                                UploadFilesDialog.this.show();
                                return;
                            default:
                                return;
                        }
                    }
                };
                this.e.f = new DownToUpSlideDialog.b() { // from class: com.meituan.android.customerservice.channel.upload.UploadFilesDialog.3
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.customerservice.channel.widget.DownToUpSlideDialog.b
                    public final void a() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5293f025e17a096d523c34fa310bc00f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5293f025e17a096d523c34fa310bc00f");
                            return;
                        }
                        UploadFilesDialog.this.e.dismiss();
                        UploadFilesDialog.this.show();
                    }
                };
                this.e.show();
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "032903edcc398b88d099178535a18226", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "032903edcc398b88d099178535a18226");
        } else if (view.getId() == R.id.btn_close) {
            c();
        } else if (view.getId() == R.id.btn_submit) {
            a(true);
            if (this.h != null) {
                CaseUploadVoucherSyncRequest caseUploadVoucherSyncRequest = new CaseUploadVoucherSyncRequest();
                caseUploadVoucherSyncRequest.setUploadContent(this.l.getText().toString());
                caseUploadVoucherSyncRequest.setUploadType("0");
                ArrayList arrayList = new ArrayList();
                Iterator<UploadFileInfo> it = this.j.c.iterator();
                while (it.hasNext()) {
                    UploadFileInfo next = it.next();
                    UploadFileResultEntity uploadFileResultEntity = new UploadFileResultEntity();
                    uploadFileResultEntity.setFilename(next.getFileName());
                    uploadFileResultEntity.setFileSize(next.getFileSize());
                    uploadFileResultEntity.setFileType(next.getFileSuffixes());
                    uploadFileResultEntity.setUploadPath(next.getUploadPath());
                    uploadFileResultEntity.setKey(next.getKey());
                    arrayList.add(uploadFileResultEntity);
                }
                caseUploadVoucherSyncRequest.setUploadFileInfos(arrayList);
                this.h.a(caseUploadVoucherSyncRequest);
            }
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9707a40938ff78916d1c03ff3b359be6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9707a40938ff78916d1c03ff3b359be6");
            return;
        }
        this.j.a();
        this.l.setText("");
        this.l.setLines(1);
        this.m.setVisibility(8);
        a(false);
        dismiss();
    }
}
