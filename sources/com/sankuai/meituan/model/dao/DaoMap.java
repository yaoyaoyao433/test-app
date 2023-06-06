package com.sankuai.meituan.model.dao;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class DaoMap {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static DaoMap sInstance;
    private Map<Class, String> mTableNameMap;
    private Map<Object, Class> mTargetClsMap;

    public DaoMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76120633b782164e1f9499c9e119afaf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76120633b782164e1f9499c9e119afaf");
            return;
        }
        this.mTargetClsMap = new HashMap();
        this.mTableNameMap = new HashMap();
        this.mTableNameMap.put(PoiDao.class, PoiDao.TABLENAME);
        this.mTableNameMap.put(PoiAlbumsDao.class, PoiAlbumsDao.TABLENAME);
        this.mTableNameMap.put(DealAlbumDao.class, DealAlbumDao.TABLENAME);
        this.mTableNameMap.put(DealDao.class, DealDao.TABLENAME);
        this.mTableNameMap.put(DealPitchHtmlDao.class, DealPitchHtmlDao.TABLENAME);
        this.mTableNameMap.put(CityDao.class, "city");
        this.mTableNameMap.put(PoiCommentStateDao.class, PoiCommentStateDao.TABLENAME);
        this.mTableNameMap.put(PoiFavoriteDao.class, PoiFavoriteDao.TABLENAME);
        this.mTableNameMap.put(OrderDao.class, OrderDao.TABLENAME);
    }
}
