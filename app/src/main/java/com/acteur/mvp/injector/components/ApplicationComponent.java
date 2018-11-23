package com.acteur.mvp.injector.components;

import android.content.Context;

import com.acteur.mvp.injector.modules.ApplicationModule;
import com.acteur.mvp.rxbus.RxBus;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Riven_rabbit on 2018/11/23
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

//    void inject(BaseActivity baseActivity);

    // provide
//    Context getContext();
//    RxBus getRxBus();
//    DaoSession getDaoSession();
}