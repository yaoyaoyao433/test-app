package com.meituan.android.identifycardrecognizer;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.meituan.android.identifycardrecognizer.adapter.PhotoPreviewAdapter;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.utils.al;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PhotoPreviewActivity extends PayBaseActivity {
    public static ChangeQuickRedirect a;
    public ArrayList<String> b;
    private View c;
    private ViewPager d;
    private View e;
    private PhotoPreviewAdapter f;
    private a g;
    private int h;
    private boolean i;
    private boolean q;

    public static /* synthetic */ void c(PhotoPreviewActivity photoPreviewActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, photoPreviewActivity, changeQuickRedirect, false, "0b45f6a46d4e1e622019396e7b93098b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, photoPreviewActivity, changeQuickRedirect, false, "0b45f6a46d4e1e622019396e7b93098b");
            return;
        }
        photoPreviewActivity.e.setVisibility(8);
        if (photoPreviewActivity.q) {
            return;
        }
        photoPreviewActivity.c.setVisibility(8);
    }

    public static void a(Activity activity, ArrayList<String> arrayList, int i, int i2, boolean z) {
        Object[] objArr = {activity, arrayList, 0, 11, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "260dbaa9f646d4db880503fba81704c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "260dbaa9f646d4db880503fba81704c9");
            return;
        }
        Intent intent = new Intent(activity, PhotoPreviewActivity.class);
        intent.putStringArrayListExtra("PHOTO_PATHS", arrayList);
        intent.putExtra("IsSingleView", true);
        intent.putExtra("POSITION", 0);
        activity.startActivityForResult(intent, 11);
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity, com.meituan.android.paybase.activity.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bad6d41a6a39e5d2cb445d64799d072", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bad6d41a6a39e5d2cb445d64799d072");
            return;
        }
        super.onCreate(bundle);
        if (getIntent() != null && getIntent().getData() != null) {
            String dataString = getIntent().getDataString();
            if (!TextUtils.isEmpty(dataString) && dataString.startsWith("meituanpayment://identify/idcard")) {
                this.g = new a();
                a aVar = this.g;
                Object[] objArr2 = {this};
                ChangeQuickRedirect changeQuickRedirect2 = a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "053bd6059f1e12b4c5c6551979da6df3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "053bd6059f1e12b4c5c6551979da6df3");
                    return;
                }
                Object[] objArr3 = {this};
                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "cadf2c26251323c58324936483208eb2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "cadf2c26251323c58324936483208eb2");
                } else {
                    com.meituan.android.identifycardrecognizer.utils.b.b = null;
                    com.meituan.android.identifycardrecognizer.utils.b.c = null;
                    com.meituan.android.identifycardrecognizer.utils.b.d = null;
                    com.meituan.android.identifycardrecognizer.utils.b.e = null;
                    Uri data = getIntent().getData();
                    if (data != null) {
                        String queryParameter = data.getQueryParameter("bizId");
                        if (TextUtils.isEmpty(queryParameter)) {
                            queryParameter = "0";
                        }
                        com.meituan.android.identifycardrecognizer.utils.b.b = queryParameter;
                        String queryParameter2 = data.getQueryParameter("needHandIdPhoto");
                        if (TextUtils.isEmpty(queryParameter2)) {
                            queryParameter2 = "0";
                        }
                        com.meituan.android.identifycardrecognizer.utils.b.c = queryParameter2;
                        com.meituan.android.identifycardrecognizer.utils.b.e = data.getQueryParameter("customerId");
                    }
                }
                getWindow().setBackgroundDrawableResource(R.color.paybase__transparent);
                String str = "?bizId=" + com.meituan.android.identifycardrecognizer.utils.b.a() + "&customId=" + com.meituan.android.identifycardrecognizer.utils.b.e + "&needHandIdPhoto=" + com.meituan.android.identifycardrecognizer.utils.b.c;
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a.a;
                if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "ea6de793ec55d12dfe1915c9dcc19429", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "ea6de793ec55d12dfe1915c9dcc19429");
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("bizId", com.meituan.android.identifycardrecognizer.utils.b.a());
                    hashMap.put("customerId", com.meituan.android.identifycardrecognizer.utils.b.e);
                    com.meituan.android.identifycardrecognizer.utils.d.a(hashMap);
                }
                com.meituan.android.identifycardrecognizer.utils.d.a("b_pay_identitycard_begin_sc", null);
                al.a(this, "https://npay.meituan.com/resource/sdk-inside-pages/index.html" + str, 11);
                return;
            }
        }
        setContentView(R.layout.identifycard_recognizer_activity_photo_preview);
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "8ea9813a14e11fcf4837b56421232d06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "8ea9813a14e11fcf4837b56421232d06");
        } else {
            Toolbar toolbar = (Toolbar) findViewById(R.id.tool_bar);
            if (toolbar != null) {
                toolbar.setNavigationIcon(R.drawable.identifycard_recognizer_base_icon_back);
                toolbar.setTitle("");
                ((TextView) findViewById(R.id.txt_title)).setText("照片");
                toolbar.setBackgroundColor(Color.parseColor("#FFFFFF"));
                setSupportActionBar(toolbar);
                toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.identifycardrecognizer.PhotoPreviewActivity.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr6 = {view};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "e71efece511beff9b0ad247fe363163b", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "e71efece511beff9b0ad247fe363163b");
                        } else {
                            PhotoPreviewActivity.this.onBackPressed();
                        }
                    }
                });
                ActionBar supportActionBar = getSupportActionBar();
                if (supportActionBar != null) {
                    supportActionBar.a(true);
                    supportActionBar.b(false);
                }
            }
        }
        this.e = findViewById(R.id.title_layout);
        this.c = findViewById(R.id.bottom_layout);
        this.d = (ViewPager) findViewById(R.id.view_pager);
        this.q = com.sankuai.waimai.platform.utils.f.a(getIntent(), "IsSingleView", true);
        this.h = com.sankuai.waimai.platform.utils.f.a(getIntent(), "POSITION", 0);
        this.b = com.sankuai.waimai.platform.utils.f.b(getIntent(), "PHOTO_PATHS");
        if (this.q && this.b != null && this.b.size() > this.h) {
            this.b = new ArrayList<>();
            this.b.add(this.b.get(this.h));
        }
        if (this.b == null) {
            this.b = new ArrayList<>();
        }
        this.f = new PhotoPreviewAdapter(this, this.b);
        this.d.setAdapter(this.f);
        this.f.b = new PhotoPreviewAdapter.a() { // from class: com.meituan.android.identifycardrecognizer.PhotoPreviewActivity.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.identifycardrecognizer.adapter.PhotoPreviewAdapter.a
            public final void a(int i) {
                Object[] objArr6 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "3c3829b41c1b27dc51db8fc82759d95c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "3c3829b41c1b27dc51db8fc82759d95c");
                    return;
                }
                if (PhotoPreviewActivity.this.i) {
                    PhotoPreviewActivity.this.g();
                } else {
                    PhotoPreviewActivity.c(PhotoPreviewActivity.this);
                }
                PhotoPreviewActivity.this.i = true ^ PhotoPreviewActivity.this.i;
            }
        };
        this.d.setCurrentItem(this.h);
        g();
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "671cbec5452ed6252d5378d21dfb9614", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "671cbec5452ed6252d5378d21dfb9614");
        } else {
            setTheme(R.style.NoActionBar_Overlay);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02572df5cf8f553d5ca4bdf81793f708", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02572df5cf8f553d5ca4bdf81793f708");
            return;
        }
        this.e.setVisibility(0);
        if (this.q) {
            return;
        }
        this.c.setVisibility(0);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6609008af4a28671404bbdf6198a46b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6609008af4a28671404bbdf6198a46b0");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        super.onActivityResult(i, i2, intent);
        if (this.g != null) {
            a aVar = this.g;
            Object[] objArr2 = {this, Integer.valueOf(i), Integer.valueOf(i2), intent};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "4f4b0274bed75cdbf94a9243ca076304", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "4f4b0274bed75cdbf94a9243ca076304");
            } else if (i == 11) {
                if (i2 == -1) {
                    if (!TextUtils.isEmpty(com.sankuai.waimai.platform.utils.f.a(intent, "resultData"))) {
                        String a2 = com.sankuai.waimai.platform.utils.f.a(intent, "resultData");
                        Intent intent2 = new Intent();
                        try {
                            str = new JSONObject(a2).getString("status");
                        } catch (JSONException e) {
                            com.meituan.android.paybase.common.analyse.a.a(e, "OcrCapture_onActivityResult", (Map<String, Object>) null);
                            str = null;
                        }
                        if (TextUtils.equals(str, "success")) {
                            intent2.putExtra("result", "success");
                            setResult(-1, intent2);
                        } else if (TextUtils.equals(str, "fail")) {
                            intent2.putExtra("result", "fail");
                            setResult(-1, intent2);
                        }
                        finish();
                    } else if (TextUtils.equals(com.sankuai.waimai.platform.utils.f.a(intent, "status"), "fail")) {
                        Intent intent3 = new Intent();
                        intent3.putExtra("result", "fail");
                        setResult(-1, intent3);
                        finish();
                    }
                } else if (i2 == 0) {
                    com.meituan.android.identifycardrecognizer.utils.d.a("b_pay_identitycard_cancel_sc", null);
                    finish();
                }
            }
        }
        com.meituan.android.privacy.aop.a.b();
    }

    @Override // com.meituan.android.paybase.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6dc9a180c99fcb039fff59a62f95f657", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6dc9a180c99fcb039fff59a62f95f657");
        } else {
            finish();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class a {
        public static ChangeQuickRedirect a;
        public final int b;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01cbbd86f5f7528938b8cac533bb0879", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01cbbd86f5f7528938b8cac533bb0879");
            } else {
                this.b = 11;
            }
        }
    }
}
