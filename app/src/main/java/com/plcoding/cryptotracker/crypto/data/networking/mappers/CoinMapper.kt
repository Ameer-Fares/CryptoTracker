package com.plcoding.cryptotracker.crypto.data.networking.mappers

import com.plcoding.cryptotracker.crypto.data.networking.dto.CoinDto
import com.plcoding.cryptotracker.crypto.domain.models.Coin

fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        name = name,
        rank = rank,
        symbol = symbol,
        marketCapUsd = marketCapUsd,
        priceUsd = priceUsd,
        changePercent24Hr = changePercent24Hr
    )
}