package com.acteur.mvp.injector.modules;

import android.content.Context;

import com.acteur.mvp.rxbus.RxBus;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Riven_rabbit on 2018/11/23
 */
@Module
public class ApplicationModule {

//    private final AndroidApplication mApplication;
//    private final DaoSession mDaoSession;
//    private final RxBus mRxBus;
//
//    public ApplicationModule(AndroidApplication application, DaoSession daoSession, RxBus rxBus) {
//        mApplication = application;
//        mDaoSession = daoSession;
//        mRxBus = rxBus;
//    }
//
//    @Provides
//    @Singleton
//    Context provideApplicationContext() {
//        return mApplication.getApplication();
//    }
//
//    @Provides
//    @Singleton
//    RxBus provideRxBus() {
//        return mRxBus;
//    }
//
//    @Provides
//    @Singleton
//    DaoSession provideDaoSession() {
//        return mDaoSession;
//    }
}
