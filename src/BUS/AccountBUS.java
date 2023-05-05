/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.AccountDAO;
import DTO.AccountDTO;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author vithi
 */
public class AccountBUS {
    private ArrayList<AccountDTO> listaccDTO = new ArrayList<>();
    AccountDAO accDAO = new AccountDAO();
    
    public AccountBUS()
    {
        listaccDTO = accDAO.listAccount();
    }
    public void listAccount()
    {
        listaccDTO = accDAO.listAccount();
    }
    public AccountDTO getUsername(String username)
    {
        for(AccountDTO accDTO : listaccDTO)
        {
            if(accDTO.getUsername().equals(username))
            {
                return accDTO;
            }
        }
        return null;
    }
    
    public boolean add(AccountDTO accDTO)
    {
        boolean ok = accDAO.add(accDTO);
        if(ok)
        {
            listaccDTO.add(accDTO);
        }
        return ok;
    }
    public boolean add(String username, String pass, String role)
    {
        AccountDTO accDTO = new AccountDTO(username, pass, role);
        return add(accDTO);
    }
    public boolean delete(String username)
    {
        boolean ok = accDAO.delete(username);
        if(ok)
        {
            for(int i=(listaccDTO.size() - 1); i>=0; i--)
            {
                if(listaccDTO.get(i).getUsername().equals(username))
                {
                    listaccDTO.remove(i);
                }
            }
        }
        return ok;
    }
//    public void delete(String username)
//    {
//        for(AccountDTO accDTO : listaccDTO)
//        {
//            if(accDTO.getUsername().equals(username))
//            {
//                listaccDTO.remove(accDTO);
//                AccountDAO accDAO = new AccountDAO();
//                accDAO.delete(username);
//                return;
//            }
//        }
//    }
    
    public boolean update(String username, String pass, String role)
    {
        boolean ok = accDAO.update(username, pass, role);
        if(ok)
        {
            listaccDTO.forEach((accDTO) -> {
                if(accDTO.getUsername().equals(username))
                {
                    accDTO.setPassword(pass);
                    accDTO.setRole(role);
                }
            });
        }
        return ok;
    }
    
    public ArrayList<AccountDTO> getAccount()
    {
        return listaccDTO;
    }
}
