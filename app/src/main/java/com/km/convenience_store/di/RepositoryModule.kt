package com.km.convenience_store.di

import com.km.convenience_store.data.repository.ProductRepository
import com.km.convenience_store.data.repository.ProductRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {
    @Binds
    @Singleton
    fun bindUserRepository(userRepositoryImpl: ProductRepositoryImpl): ProductRepository
}