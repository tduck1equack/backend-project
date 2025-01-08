package sendo.sendoclonebackend.services;

import sendo.sendoclonebackend.entities.Cart;

public interface ICartServices {
    public Cart getCart(int userId);
}
