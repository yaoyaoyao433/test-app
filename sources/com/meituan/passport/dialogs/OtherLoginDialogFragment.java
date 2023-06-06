package com.meituan.passport.dialogs;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.passport.UserCenter;
import com.meituan.passport.login.d;
import com.meituan.passport.pojo.OAuthItem;
import com.meituan.passport.utils.Utils;
import com.meituan.passport.utils.ae;
import com.meituan.passport.utils.ag;
import com.meituan.passport.utils.b;
import com.meituan.passport.utils.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class OtherLoginDialogFragment extends BottomListDialogFragment {
    public static ChangeQuickRedirect c;
    public d.b d;
    public a e;
    public View f;
    public Fragment g;
    public t.a h;
    private LayoutInflater i;
    private View.OnClickListener j;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(String str);
    }

    public OtherLoginDialogFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3780a717bc45f39dfda7828fc5f7868", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3780a717bc45f39dfda7828fc5f7868");
            return;
        }
        this.j = new View.OnClickListener() { // from class: com.meituan.passport.dialogs.OtherLoginDialogFragment.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d9fa30a244626051585ed4e9a0412146", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d9fa30a244626051585ed4e9a0412146");
                } else {
                    OtherLoginDialogFragment.this.a(view.getTag().toString());
                }
            }
        };
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = j.a;
        this.h = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f0036734800dc66385e1ffb4f7dff3ab", RobustBitConfig.DEFAULT_VALUE) ? (t.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f0036734800dc66385e1ffb4f7dff3ab") : new j(this);
    }

    @Override // com.meituan.passport.dialogs.BottomListDialogFragment, com.meituan.passport.dialogs.BottomDialogFragment, android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ce48ed748bff376ecf2e367f09ddbc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ce48ed748bff376ecf2e367f09ddbc8");
        } else {
            super.onCreate(bundle);
        }
    }

    @Override // com.meituan.passport.dialogs.BottomListDialogFragment, com.meituan.passport.dialogs.BottomDialogFragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "464dd5497932e4d68e3f1942a040e667", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "464dd5497932e4d68e3f1942a040e667");
        }
        this.i = layoutInflater;
        return layoutInflater.inflate(R.layout.passport_other_login_dialog, viewGroup, false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    @Override // com.meituan.passport.dialogs.BottomListDialogFragment, com.meituan.passport.dialogs.BottomDialogFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Iterator<OAuthItem> it;
        char c2;
        String string;
        View view2;
        int i = 2;
        ?? r11 = 0;
        char c3 = 1;
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfd22266c75d936cf3aa726c4d9ecdbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfd22266c75d936cf3aa726c4d9ecdbf");
            return;
        }
        view.setBackgroundColor(a());
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = k.a;
        view.setOnClickListener(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "165f3dbffba20f491c97c3f1c7d35741", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "165f3dbffba20f491c97c3f1c7d35741") : new k(this));
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.other_dialog);
        List<OAuthItem> b = com.meituan.passport.login.f.INSTANCE.b(this.d);
        if (b == null || b.size() == 0) {
            return;
        }
        Iterator<OAuthItem> it2 = b.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            OAuthItem next = it2.next();
            Object[] objArr3 = new Object[i];
            objArr3[r11] = next;
            objArr3[c3] = linearLayout;
            ChangeQuickRedirect changeQuickRedirect3 = c;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "21a73423be2c5032193ad3b51dae5ca1", RobustBitConfig.DEFAULT_VALUE)) {
                view2 = (View) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, r11, "21a73423be2c5032193ad3b51dae5ca1");
                it = it2;
            } else {
                LinearLayout linearLayout2 = (LinearLayout) this.i.inflate((int) R.layout.passport_other_login_dialog_item, linearLayout, (boolean) r11);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(Utils.a(getContext(), 29.0f), Utils.a(getContext(), 29.0f));
                com.meituan.passport.utils.t tVar = new com.meituan.passport.utils.t(new ArrayList(Collections.singleton(next)), linearLayout2);
                tVar.e = this.h;
                linearLayout2.addView(tVar.a(next), (int) r11, layoutParams);
                TextView textView = (TextView) linearLayout2.findViewById(R.id.other_item_text);
                textView.setTextSize(1, 21.0f);
                Object[] objArr4 = new Object[1];
                objArr4[r11] = next;
                ChangeQuickRedirect changeQuickRedirect4 = c;
                it = it2;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b51a440798e2b5d13314721283f9e81c", RobustBitConfig.DEFAULT_VALUE)) {
                    string = (String) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b51a440798e2b5d13314721283f9e81c");
                } else {
                    if (next != null) {
                        String str = next.type;
                        switch (str.hashCode()) {
                            case -1474483372:
                                if (str.equals(UserCenter.OAUTH_TYPE_UNIQUE)) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1427573947:
                                if (str.equals(UserCenter.OAUTH_TYPE_QQ)) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -791575966:
                                if (str.equals(UserCenter.OAUTH_TYPE_WEIXIN)) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -282778279:
                                if (str.equals("verification_code/password")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 409238928:
                                if (str.equals(UserCenter.OAUTH_TYPE_CHINA_MOBILE)) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case 0:
                                string = getString(R.string.passport_login_type_qq);
                                break;
                            case 1:
                                string = getString(R.string.passport_login_type_wechat);
                                break;
                            case 2:
                                string = getString(R.string.passport_login_type_phone);
                                break;
                            case 3:
                                string = getString(R.string.passport_login_type_operator);
                                break;
                            case 4:
                                if (com.meituan.passport.plugins.l.a().c != null && com.meituan.passport.plugins.l.a().c.size() > 0) {
                                    string = com.meituan.passport.plugins.l.a().c.get(0).appShowName + getString(R.string.passport_login_type_login);
                                    break;
                                } else {
                                    string = getString(R.string.passport_login_type_login);
                                    break;
                                }
                                break;
                        }
                    }
                    string = getString(R.string.passport_login_type_login);
                }
                textView.setText(string);
                linearLayout2.setOnClickListener(this.j);
                linearLayout2.setTag(next.type);
                view2 = linearLayout2;
            }
            int i3 = i2 + 1;
            linearLayout.addView(view2, i2);
            i2 = i3 + 1;
            linearLayout.addView(e(), i3, d());
            it2 = it;
            i = 2;
            r11 = 0;
            c3 = 1;
        }
        view.findViewById(R.id.cancel).setOnClickListener(new View.OnClickListener() { // from class: com.meituan.passport.dialogs.OtherLoginDialogFragment.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                Object[] objArr5 = {view3};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "90106c8c28c37578d1c04b5a4c77b9d2", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "90106c8c28c37578d1c04b5a4c77b9d2");
                } else {
                    OtherLoginDialogFragment.this.c();
                }
            }
        });
    }

    public static /* synthetic */ void a(OtherLoginDialogFragment otherLoginDialogFragment, View view) {
        Object[] objArr = {otherLoginDialogFragment, view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ca284f40bf52bd9acb44f00772bcd5e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ca284f40bf52bd9acb44f00772bcd5e0");
        } else {
            otherLoginDialogFragment.c();
        }
    }

    @Override // com.meituan.passport.dialogs.BottomListDialogFragment
    public final View e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4397fdc4bc3b9e15a0d14954246e300d", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4397fdc4bc3b9e15a0d14954246e300d");
        }
        View view = new View(getContext());
        view.setBackgroundColor(Color.parseColor("#f2f2f2"));
        return view;
    }

    public static /* synthetic */ void a(OtherLoginDialogFragment otherLoginDialogFragment, OAuthItem oAuthItem) {
        Object[] objArr = {otherLoginDialogFragment, oAuthItem};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a84f996cde8dc69561d0ed25c184b1eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a84f996cde8dc69561d0ed25c184b1eb");
        } else {
            otherLoginDialogFragment.a(oAuthItem.type);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44e129d972c7c43b521e8922c973b44a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44e129d972c7c43b521e8922c973b44a");
            return;
        }
        c();
        boolean j = new b.c(getArguments()).j();
        OAuthItem from = OAuthItem.from(str);
        if (from == null) {
            return;
        }
        if (j) {
            if (TextUtils.equals(from.type, UserCenter.OAUTH_TYPE_QQ) || TextUtils.equals(from.type, UserCenter.OAUTH_TYPE_WEIXIN)) {
                com.meituan.passport.utils.p a2 = com.meituan.passport.utils.p.a();
                FragmentActivity activity = getActivity();
                a2.a((Activity) activity, true, from.name + "登录");
            }
            a(from.type, from.name);
        } else if (this.e != null) {
            if (TextUtils.equals(from.type, UserCenter.OAUTH_TYPE_QQ) || TextUtils.equals(from.type, UserCenter.OAUTH_TYPE_WEIXIN)) {
                com.meituan.passport.utils.p a3 = com.meituan.passport.utils.p.a();
                FragmentActivity activity2 = getActivity();
                a3.a((Activity) activity2, false, from.name + "登录");
            }
            this.e.a(from.type);
        }
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af71752584a23e95a652b61135b08b4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af71752584a23e95a652b61135b08b4d");
            return;
        }
        Bundle arguments = getArguments();
        if (TextUtils.equals(str, UserCenter.OAUTH_TYPE_UNIQUE)) {
            com.sankuai.meituan.navigation.d.a(this.f).a(com.meituan.passport.login.a.UnionLogin.g, arguments);
        } else if (TextUtils.equals(str, UserCenter.OAUTH_TYPE_CHINA_MOBILE)) {
            com.sankuai.meituan.navigation.d.a(this.f).a(com.meituan.passport.login.a.ChinaMobile.g, arguments);
        } else if (TextUtils.equals(str, "verification_code/password")) {
            com.sankuai.meituan.navigation.d.a(this.f).a(com.meituan.passport.login.a.DynamicAccount.g, arguments);
        } else {
            Intent a2 = ag.a(str);
            if (a2 == null) {
                ae.a(getView(), getResources().getString(R.string.passport_index_wechat_error, str2)).a();
                return;
            }
            if (getActivity() != null && getActivity().getIntent() != null && !TextUtils.isEmpty(com.sankuai.waimai.platform.utils.f.a(getActivity().getIntent(), "mmpMultiTaskLogin"))) {
                a2.putExtra("mmpMultiTaskLogin", com.sankuai.waimai.platform.utils.f.a(getActivity().getIntent(), "mmpMultiTaskLogin"));
            }
            this.g.startActivityForResult(a2, 1);
        }
    }
}
