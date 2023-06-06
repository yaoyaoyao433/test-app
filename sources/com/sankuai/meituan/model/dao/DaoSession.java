package com.sankuai.meituan.model.dao;

import android.database.sqlite.SQLiteDatabase;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.DaoConfig;
import de.greenrobot.dao.IdentityScopeType;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class DaoSession extends AbstractDaoSession {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final CityDao cityDao;
    private final DaoConfig cityDaoConfig;
    private final DealAlbumDao dealAlbumDao;
    private final DaoConfig dealAlbumDaoConfig;
    private final DealDao dealDao;
    private final DaoConfig dealDaoConfig;
    private final DealPitchHtmlDao dealPitchHtmlDao;
    private final DaoConfig dealPitchHtmlDaoConfig;
    private final OrderDao orderDao;
    private final DaoConfig orderDaoConfig;
    private final PoiAlbumsDao poiAlbumsDao;
    private final DaoConfig poiAlbumsDaoConfig;
    private final PoiCommentStateDao poiCommentStateDao;
    private final DaoConfig poiCommentStateDaoConfig;
    private final PoiDao poiDao;
    private final DaoConfig poiDaoConfig;
    private final PoiFavoriteDao poiFavoriteDao;
    private final DaoConfig poiFavoriteDaoConfig;

    public DaoSession(SQLiteDatabase sQLiteDatabase, IdentityScopeType identityScopeType, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig> map) {
        super(sQLiteDatabase);
        Object[] objArr = {sQLiteDatabase, identityScopeType, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f1279bf153f669ddcd01bb6f9d0b82fe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f1279bf153f669ddcd01bb6f9d0b82fe");
            return;
        }
        this.poiDaoConfig = map.get(PoiDao.class).m38clone();
        this.poiDaoConfig.initIdentityScope(identityScopeType);
        this.poiAlbumsDaoConfig = map.get(PoiAlbumsDao.class).m38clone();
        this.poiAlbumsDaoConfig.initIdentityScope(identityScopeType);
        this.dealAlbumDaoConfig = map.get(DealAlbumDao.class).m38clone();
        this.dealAlbumDaoConfig.initIdentityScope(identityScopeType);
        this.dealDaoConfig = map.get(DealDao.class).m38clone();
        this.dealDaoConfig.initIdentityScope(identityScopeType);
        this.dealPitchHtmlDaoConfig = map.get(DealPitchHtmlDao.class).m38clone();
        this.dealPitchHtmlDaoConfig.initIdentityScope(identityScopeType);
        this.cityDaoConfig = map.get(CityDao.class).m38clone();
        this.cityDaoConfig.initIdentityScope(identityScopeType);
        this.poiCommentStateDaoConfig = map.get(PoiCommentStateDao.class).m38clone();
        this.poiCommentStateDaoConfig.initIdentityScope(identityScopeType);
        this.poiFavoriteDaoConfig = map.get(PoiFavoriteDao.class).m38clone();
        this.poiFavoriteDaoConfig.initIdentityScope(identityScopeType);
        this.orderDaoConfig = map.get(OrderDao.class).m38clone();
        this.orderDaoConfig.initIdentityScope(identityScopeType);
        this.poiDao = new PoiDao(this.poiDaoConfig, this);
        this.poiAlbumsDao = new PoiAlbumsDao(this.poiAlbumsDaoConfig, this);
        this.dealAlbumDao = new DealAlbumDao(this.dealAlbumDaoConfig, this);
        this.dealDao = new DealDao(this.dealDaoConfig, this);
        this.dealPitchHtmlDao = new DealPitchHtmlDao(this.dealPitchHtmlDaoConfig, this);
        this.cityDao = new CityDao(this.cityDaoConfig, this);
        this.poiCommentStateDao = new PoiCommentStateDao(this.poiCommentStateDaoConfig, this);
        this.poiFavoriteDao = new PoiFavoriteDao(this.poiFavoriteDaoConfig, this);
        this.orderDao = new OrderDao(this.orderDaoConfig, this);
        registerDao(Poi.class, this.poiDao);
        registerDao(PoiAlbums.class, this.poiAlbumsDao);
        registerDao(DealAlbum.class, this.dealAlbumDao);
        registerDao(Deal.class, this.dealDao);
        registerDao(DealPitchHtml.class, this.dealPitchHtmlDao);
        registerDao(City.class, this.cityDao);
        registerDao(PoiCommentState.class, this.poiCommentStateDao);
        registerDao(PoiFavorite.class, this.poiFavoriteDao);
        registerDao(Order.class, this.orderDao);
    }
}
