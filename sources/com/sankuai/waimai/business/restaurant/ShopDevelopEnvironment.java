package com.sankuai.waimai.business.restaurant;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.pay.IPaymentManager;
import com.sankuai.waimai.foundation.router.interfaces.c;
import com.sankuai.waimai.foundation.utils.e;
import com.sankuai.waimai.platform.config.bean.TreeNode;
import com.sankuai.waimai.platform.config.bean.TreeNodeGenerator;
import com.sankuai.waimai.platform.config.serviceloader.BusinessNodeProvider;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ShopDevelopEnvironment implements BusinessNodeProvider {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long[] ids = {724263, 3851476};
    private static final String[] names = {"永和大王", "庆丰包子"};

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface b {
        void a(int i, long j);
    }

    @Override // com.sankuai.waimai.platform.config.serviceloader.BusinessNodeProvider
    public void onActivityResult(int i, int i2, Intent intent) {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum a {
        NORMAL_POI_INDEX,
        SELF_DELIVERY_POI_INDEX,
        GOODS_CARD_DYNAMIC_PLAYGROUND;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98dcf78659a97a6d35284f286bdc8b25", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98dcf78659a97a6d35284f286bdc8b25");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1295740f7be82cf048d94f32557ce2da", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1295740f7be82cf048d94f32557ce2da") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cc2e8144b29f0ab4c44b2e291ab7c813", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cc2e8144b29f0ab4c44b2e291ab7c813") : (a[]) values().clone();
        }
    }

    @Override // com.sankuai.waimai.platform.config.serviceloader.BusinessNodeProvider
    public TreeNode getNode(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35b237cf3492e8ab09a8ae656ae459dd", RobustBitConfig.DEFAULT_VALUE)) {
            return (TreeNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35b237cf3492e8ab09a8ae656ae459dd");
        }
        e<a> eVar = new e<>("waimai_restaurant_test");
        TreeNode treeNode = TreeNodeGenerator.getTreeNode("restaurant库");
        addNormal(activity, eVar, treeNode);
        addSelfDelivery(activity, eVar, treeNode);
        return treeNode;
    }

    private void addNormal(final Activity activity, final e<a> eVar, TreeNode treeNode) {
        Object[] objArr = {activity, eVar, treeNode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1cc69915f79a0d13d0adfb3b2bac281", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1cc69915f79a0d13d0adfb3b2bac281");
            return;
        }
        int b2 = eVar.b((e<a>) a.NORMAL_POI_INDEX, 0);
        b2 = (b2 < 0 || b2 > ids.length) ? 0 : 0;
        final long j = ids[b2];
        String str = names[b2];
        treeNode.addChild(TreeNodeGenerator.getTreeNode("普通点菜页(" + str + CommonConstant.Symbol.BRACKET_RIGHT).setDesc("长按切换Poi").setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.ShopDevelopEnvironment.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2ebe30d5bf2311ac181ba589fa7bf1f6", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2ebe30d5bf2311ac181ba589fa7bf1f6");
                } else {
                    ShopDevelopEnvironment.this.showRestaurant(activity, j);
                }
            }
        }).setOnLongClickListener(new View.OnLongClickListener() { // from class: com.sankuai.waimai.business.restaurant.ShopDevelopEnvironment.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ba06b661ae80ef668b2365f4721f4e2e", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ba06b661ae80ef668b2365f4721f4e2e")).booleanValue();
                }
                ShopDevelopEnvironment.this.choosePoi(activity, new b() { // from class: com.sankuai.waimai.business.restaurant.ShopDevelopEnvironment.1.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.business.restaurant.ShopDevelopEnvironment.b
                    public final void a(int i, long j2) {
                        Object[] objArr3 = {Integer.valueOf(i), new Long(j2)};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "a763dd33f985176370d713c6de2a4425", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "a763dd33f985176370d713c6de2a4425");
                            return;
                        }
                        eVar.a((e) a.NORMAL_POI_INDEX, i);
                        ShopDevelopEnvironment.this.showRestaurant(activity, j2);
                    }
                });
                return true;
            }
        }));
    }

    private void addSelfDelivery(final Activity activity, final e<a> eVar, TreeNode treeNode) {
        Object[] objArr = {activity, eVar, treeNode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9906b85bd455d457c201593e921dbc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9906b85bd455d457c201593e921dbc1");
            return;
        }
        int b2 = eVar.b((e<a>) a.SELF_DELIVERY_POI_INDEX, 0);
        b2 = (b2 < 0 || b2 > ids.length) ? 0 : 0;
        final long j = ids[b2];
        String str = names[b2];
        treeNode.addChild(TreeNodeGenerator.getTreeNode("自取点菜页(" + str + CommonConstant.Symbol.BRACKET_RIGHT).setDesc("长按切换Poi").setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.ShopDevelopEnvironment.4
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "34ff35b01c43b6b7951f0524ba96b89f", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "34ff35b01c43b6b7951f0524ba96b89f");
                } else {
                    ShopDevelopEnvironment.this.showSelfDelivery(activity, j);
                }
            }
        }).setOnLongClickListener(new View.OnLongClickListener() { // from class: com.sankuai.waimai.business.restaurant.ShopDevelopEnvironment.3
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "104e36eb88b721c777b885d7d1036124", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "104e36eb88b721c777b885d7d1036124")).booleanValue();
                }
                ShopDevelopEnvironment.this.choosePoi(activity, new b() { // from class: com.sankuai.waimai.business.restaurant.ShopDevelopEnvironment.3.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.business.restaurant.ShopDevelopEnvironment.b
                    public final void a(int i, long j2) {
                        Object[] objArr3 = {Integer.valueOf(i), new Long(j2)};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "52c61ba72a4ce9b9b1ca0e1b877182d8", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "52c61ba72a4ce9b9b1ca0e1b877182d8");
                            return;
                        }
                        eVar.a((e) a.SELF_DELIVERY_POI_INDEX, i);
                        ShopDevelopEnvironment.this.showSelfDelivery(activity, j2);
                    }
                });
                return true;
            }
        }));
    }

    private void addPlayGround(Activity activity, e<a> eVar, TreeNode treeNode) {
        Object[] objArr = {activity, eVar, treeNode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e9952c6b6a9524c009a95ae4f91e85d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e9952c6b6a9524c009a95ae4f91e85d");
            return;
        }
        eVar.b((e<a>) a.GOODS_CARD_DYNAMIC_PLAYGROUND, 0);
        treeNode.addChild(TreeNodeGenerator.getTreeNode("点菜页动态化").setDesc("点击跳转playground").setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.ShopDevelopEnvironment.6
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "cff51afad8cdee4579a220a49100b7ff", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "cff51afad8cdee4579a220a49100b7ff");
                } else {
                    System.out.println("hwr_playground_onClick");
                }
            }
        }).setOnLongClickListener(new View.OnLongClickListener() { // from class: com.sankuai.waimai.business.restaurant.ShopDevelopEnvironment.5
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "954f54611778b0fe65cc721aa2dc9ffd", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "954f54611778b0fe65cc721aa2dc9ffd")).booleanValue();
                }
                System.out.println("hwr_playground_onLongClick");
                return true;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void choosePoi(Activity activity, final b bVar) {
        Object[] objArr = {activity, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48e64fed737c82a19aba2e7994cd1426", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48e64fed737c82a19aba2e7994cd1426");
        } else {
            new CustomDialog.a(activity).a(names, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.ShopDevelopEnvironment.7
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b4d23397a959de1dd6f038b49d59fd56", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b4d23397a959de1dd6f038b49d59fd56");
                    } else {
                        bVar.a(i, ShopDevelopEnvironment.ids[i]);
                    }
                }
            }).b(IPaymentManager.NO_ACTION, (DialogInterface.OnClickListener) null).b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showRestaurant(Activity activity, long j) {
        Object[] objArr = {activity, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89f9e3cb5fc0075d27ff2f4f73a95b3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89f9e3cb5fc0075d27ff2f4f73a95b3f");
        } else {
            new com.sankuai.waimai.router.common.b(activity, c.b).a("poiId", j).g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showSelfDelivery(Activity activity, long j) {
        Object[] objArr = {activity, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c138b637ed01443bcf635ab79864c52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c138b637ed01443bcf635ab79864c52");
        } else {
            new com.sankuai.waimai.router.common.b(activity, c.X).a("poi_id", j).g();
        }
    }
}
