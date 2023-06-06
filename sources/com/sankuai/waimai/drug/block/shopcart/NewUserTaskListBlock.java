package com.sankuai.waimai.drug.block.shopcart;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.store.base.b;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class NewUserTaskListBlock extends b {
    public static ChangeQuickRedirect a;
    private TaskListFragment b;
    @NonNull
    private final com.sankuai.waimai.store.shopping.cart.contract.a c;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();
    }

    public NewUserTaskListBlock(@NonNull Context context, @NotNull com.sankuai.waimai.store.shopping.cart.contract.a aVar) {
        super(context);
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b3899c18b9597759462fade7d78e038", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b3899c18b9597759462fade7d78e038");
        } else {
            this.c = aVar;
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74acd48c51b3f2dc882bca98bac33e17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74acd48c51b3f2dc882bca98bac33e17");
        } else {
            super.onViewCreated();
        }
    }

    public final void a(String str, String str2, String str3, String str4) {
        TaskListFragment taskListFragment;
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "467589add4d76ccc637423963a4558e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "467589add4d76ccc637423963a4558e3");
            return;
        }
        if (this.b == null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "bbd2118d7ec62cf7d1d0be9916252176", RobustBitConfig.DEFAULT_VALUE)) {
                taskListFragment = (TaskListFragment) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "bbd2118d7ec62cf7d1d0be9916252176");
            } else {
                Bundle bundle = new Bundle();
                TaskListFragment taskListFragment2 = new TaskListFragment();
                bundle.putString("mrn_biz", "supermarket");
                bundle.putString("mrn_entry", "flashbuy-medicine-myhome");
                bundle.putString("mrn_component", "flashbuy-medicine-mytasklist");
                taskListFragment2.setArguments(bundle);
                taskListFragment = taskListFragment2;
            }
            this.b = taskListFragment;
            Bundle bundle2 = new Bundle();
            bundle2.putString("poi_id", str);
            bundle2.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, str2);
            bundle2.putString("sku_id", str3);
            bundle2.putString("cid", str4);
            this.b.a(bundle2);
            this.b.b = new a() { // from class: com.sankuai.waimai.drug.block.shopcart.NewUserTaskListBlock.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.drug.block.shopcart.NewUserTaskListBlock.a
                public final void a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4fd5a9aa741e69ea37d64b92d02fa027", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4fd5a9aa741e69ea37d64b92d02fa027");
                    } else {
                        NewUserTaskListBlock.this.hide();
                    }
                }
            };
            ((FragmentActivity) this.mContext).getSupportFragmentManager().beginTransaction().replace(this.mView.getId(), this.b).commitAllowingStateLoss();
        }
        super.show();
    }

    public final void a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6736e83d91212143c962369ee7c74689", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6736e83d91212143c962369ee7c74689");
        } else {
            a(str, "", str2, str3);
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void hide() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8daaa133aa2f86017a5811ab55f4ebe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8daaa133aa2f86017a5811ab55f4ebe");
            return;
        }
        super.hide();
        this.c.e();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class TaskListFragment extends DrugCommonRNFragment {
        public static ChangeQuickRedirect a;
        a b;
        private final CloseBroadcastReceiver k;

        public TaskListFragment() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d0c22ec10ad363eeaa0257754ece9f3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d0c22ec10ad363eeaa0257754ece9f3");
            } else {
                this.k = new CloseBroadcastReceiver();
            }
        }

        @Override // com.sankuai.waimai.store.base.SGCommonRNFragment, android.support.v4.app.Fragment
        public final void onViewCreated(View view, @Nullable Bundle bundle) {
            Object[] objArr = {view, bundle};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9f07ecf90a46e88a72062b6bda87ad0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9f07ecf90a46e88a72062b6bda87ad0");
                return;
            }
            super.onViewCreated(view, bundle);
            if (getActivity() != null) {
                getActivity().registerReceiver(this.k, new IntentFilter("drug_shop_cart_task_list_close"));
            }
        }

        @Override // android.support.v4.app.Fragment
        public final void onDestroy() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60d563c5f15392d6d2f9480358a33562", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60d563c5f15392d6d2f9480358a33562");
                return;
            }
            super.onDestroy();
            if (getActivity() != null) {
                try {
                    getActivity().unregisterReceiver(this.k);
                } catch (Exception unused) {
                }
            }
        }

        /* compiled from: ProGuard */
        /* loaded from: classes4.dex */
        public class CloseBroadcastReceiver extends BroadcastReceiver {
            public static ChangeQuickRedirect a;

            private CloseBroadcastReceiver() {
                Object[] objArr = {TaskListFragment.this};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fbb1213378008d56143a34bbc6563e9", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fbb1213378008d56143a34bbc6563e9");
                }
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                Object[] objArr = {context, intent};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c89b1f1c80245e5e6dcf8a709480d8ad", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c89b1f1c80245e5e6dcf8a709480d8ad");
                } else if (!"drug_shop_cart_task_list_close".equals(intent.getAction()) || TaskListFragment.this.b == null) {
                } else {
                    TaskListFragment.this.b.a();
                }
            }
        }
    }
}
